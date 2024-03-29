package com.nomadcompass.infrastructure.output.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class SupermarketCostEmbCollection {

    private BigDecimal minimum;
    private BigDecimal average;
    private BigDecimal maximum;

}
