package com.nomadcompass.infrastructure.input.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class WeeklyCostResponse {

    private BigDecimal restaurant;
    private BigDecimal bar;
    private BigDecimal supermarket;

}
