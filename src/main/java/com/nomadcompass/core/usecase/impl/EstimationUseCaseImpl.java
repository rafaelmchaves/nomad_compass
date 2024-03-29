package com.nomadcompass.core.usecase.impl;

import com.nomadcompass.core.model.BarCost;
import com.nomadcompass.core.model.LifeCost;
import com.nomadcompass.core.usecase.EstimationUseCase;
import com.nomadcompass.infrastructure.input.request.DestinationRequest;
import com.nomadcompass.infrastructure.input.request.EstimationRequest;
import com.nomadcompass.infrastructure.input.response.DestinationResponse;
import com.nomadcompass.infrastructure.input.response.EstimationResponse;
import com.nomadcompass.infrastructure.input.response.WeeklyCostResponse;
import com.nomadcompass.infrastructure.output.entity.BarCostEmbCollection;
import com.nomadcompass.infrastructure.output.entity.LifeCostCollection;
import com.nomadcompass.infrastructure.output.repository.LifeCostRepository;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@RequiredArgsConstructor
@Singleton
public class EstimationUseCaseImpl implements EstimationUseCase {



    private final LifeCostRepository lifeCostRepository;

    @Override
    public void estimate(EstimationRequest estimationRequest) {

        final EstimationResponse estimationResponse = new EstimationResponse();
        estimationResponse.setDestinations(new ArrayList<>());
        for (DestinationRequest destinationRequest: estimationRequest.getDestinations()) {
            final var lifeCostEntity = this.lifeCostRepository.findByCityId(destinationRequest.getCityId());

            final var lifeCost = getLifeCostModel(lifeCostEntity);
            WeeklyCostResponse weeklyCostResponse = new WeeklyCostResponse();

            final var weeklyBarCost = lifeCost.getBarCost().getWeeklyCost(estimationRequest.getAmountDaysPerWeekBar(),
                    estimationRequest.isUseToEatBar(), estimationRequest.isUseToDrinkAlcohol());
            weeklyCostResponse.setBar(weeklyBarCost);

            final var destinationResponse = new DestinationResponse();
            destinationResponse.setCityId(destinationResponse.getCityId());
            destinationResponse.setWeeklyCost(weeklyCostResponse);

            estimationResponse.getDestinations().add(destinationResponse);
        }

        //transportation from each city to another(starting from root)
    }

    private LifeCost getLifeCostModel(LifeCostCollection lifeCostCollection) {
        return LifeCost.builder()
                .barCost(
                        getBarCost(lifeCostCollection.getBarCostEmbCollection())
                )
                .build();
    }

    private static BarCost getBarCost(BarCostEmbCollection barCostEmbCollection) {
        return BarCost.builder().alcoholDrink(barCostEmbCollection.getAlcoholDrink()).noAlcoholDrink(barCostEmbCollection.getNoAlcoholDrink())
                .cheapSnack(barCostEmbCollection.getCheapSnack()).expensiveSnack(barCostEmbCollection.getExpensiveSnack())
                .build();
    }

}
