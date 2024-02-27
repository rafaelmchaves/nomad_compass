package com.nomadcompass.core.usecase.impl;

import com.nomadcompass.core.usecase.EstimationUseCase;
import com.nomadcompass.infrastructure.input.request.DestinationRequest;
import com.nomadcompass.infrastructure.input.request.EstimationRequest;
import com.nomadcompass.infrastructure.input.response.DestinationResponse;
import com.nomadcompass.infrastructure.input.response.EstimationResponse;
import com.nomadcompass.infrastructure.input.response.WeeklyCostResponse;
import com.nomadcompass.infrastructure.output.entity.LifeCost;
import com.nomadcompass.infrastructure.output.repository.LifeCostRepository;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

@RequiredArgsConstructor
@Singleton
public class EstimationUseCaseImpl implements EstimationUseCase {

    private static final Integer AVERAGE_ALCOHOL_DRINKS_PER_PERSON_BAR = 5;
    private static final Integer AVERAGE_NO_ALCOHOL_DRINKS_PER_PERSON_BAR = 3;

    private final LifeCostRepository lifeCostRepository;

    @Override
    public void estimate(EstimationRequest estimationRequest) {

        final EstimationResponse estimationResponse = new EstimationResponse();
        estimationResponse.setDestinations(new ArrayList<>());
        for (DestinationRequest destinationRequest: estimationRequest.getDestinations()) {
            final var lifeCost = this.lifeCostRepository.findByCityId(destinationRequest.getCityId());

            WeeklyCostResponse weeklyCostResponse = new WeeklyCostResponse();

            weeklyCostResponse.setBar(getBarCostPerWeek(estimationRequest, lifeCost));
            final var destinationResponse = new DestinationResponse();
            destinationResponse.setCityId(destinationResponse.getCityId());
            destinationResponse.setWeeklyCost(weeklyCostResponse);

            estimationResponse.getDestinations().add(destinationResponse);
        }

        //transportation from each city to another(starting from root)
    }

    private static BigDecimal getBarCostPerWeek(EstimationRequest estimationRequest, LifeCost lifeCost) {

        BigDecimal barCostPerWeek = BigDecimal.ZERO;

        if (estimationRequest.getAmountDaysPerWeekBar() > 0) {

            if (estimationRequest.isUseToDrinkAlcohol()) {

                barCostPerWeek = lifeCost.getBarCost().getAlcoholDrink()
                        .multiply(new BigDecimal(AVERAGE_ALCOHOL_DRINKS_PER_PERSON_BAR))
                        .multiply(new BigDecimal(estimationRequest.getAmountDaysPerWeekBar()));

            } else {
                barCostPerWeek = lifeCost.getBarCost().getNoAlcoholDrink().multiply(
                        new BigDecimal(AVERAGE_NO_ALCOHOL_DRINKS_PER_PERSON_BAR));
            }

            if (estimationRequest.isUseToEatBar()) {
                final var averageSnack = (lifeCost.getBarCost().getCheapSnack().add(lifeCost.getBarCost().getExpensiveSnack()))
                        .divide(BigDecimal.valueOf(2), RoundingMode.UP);
                barCostPerWeek = barCostPerWeek.add(averageSnack.multiply(new BigDecimal(estimationRequest.getAmountDaysPerWeekBar())));
            }
        }
        return barCostPerWeek;
    }
}
