package com.nomadcompass.core.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RestaurantCost {

    private BigDecimal cheapMeal;
    private BigDecimal fancyMeal;
    private BigDecimal alcoholDrink;
    private BigDecimal noAlcoholDrink;

}
