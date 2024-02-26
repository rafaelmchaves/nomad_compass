package com.nomadcompass.core.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BarCost {

    private BigDecimal alcoholDrink;
    private BigDecimal noAlcoholDrink;
    private BigDecimal cheapSnack;
    private BigDecimal expensiveSnack;

}
