package com.nomadcompass.core.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class Airport {

    private String label;
    private BigDecimal distanceKm;
    private BigDecimal averageUberCost;
    private BigDecimal averageBusCost;
    private BigDecimal averageMetroCost;

}
