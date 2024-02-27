package com.nomadcompass.core.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Builder
@Getter
@Setter
public class BarCost {

    private static final Integer AVERAGE_ALCOHOL_DRINKS_PER_PERSON_BAR = 5;
    private static final Integer AVERAGE_NO_ALCOHOL_DRINKS_PER_PERSON_BAR = 3;

    private BigDecimal alcoholDrink;
    private BigDecimal noAlcoholDrink;
    private BigDecimal cheapSnack;
    private BigDecimal expensiveSnack;

    public BigDecimal getWeeklyCost(Integer amountDaysPerWeek, boolean isUseToEat, boolean isUseToDrinkAlcohol) {

        BigDecimal barCostPerWeek = BigDecimal.ZERO;

        if (amountDaysPerWeek > 0) {

            if (isUseToDrinkAlcohol) {

                barCostPerWeek = alcoholDrink.multiply(new BigDecimal(AVERAGE_ALCOHOL_DRINKS_PER_PERSON_BAR))
                        .multiply(new BigDecimal(amountDaysPerWeek));

            } else {
                barCostPerWeek = noAlcoholDrink.multiply(new BigDecimal(AVERAGE_NO_ALCOHOL_DRINKS_PER_PERSON_BAR));
            }

            if (isUseToEat) {
                final var averageSnack = (cheapSnack.add(expensiveSnack))
                        .divide(BigDecimal.valueOf(2), RoundingMode.UP);
                barCostPerWeek = barCostPerWeek.add(averageSnack.multiply(new BigDecimal(amountDaysPerWeek)));
            }
        }
        return barCostPerWeek;
    }

}
