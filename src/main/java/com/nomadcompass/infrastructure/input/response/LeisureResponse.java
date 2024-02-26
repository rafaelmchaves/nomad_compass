package com.nomadcompass.infrastructure.input.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class LeisureResponse {

    private BigDecimal cheapRestaurant;
    private BigDecimal averageRestaurant;
    private BigDecimal expensiveRestaurant;
    private BigDecimal cheapBar;
    private BigDecimal averageBar;
    private BigDecimal expensiveBar;

}
