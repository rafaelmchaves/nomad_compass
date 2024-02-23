package com.nomadcompass.infrastructure.output.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Airport {

    private String label;
    private String distanceKm;
    private String averageUberCost;
    private String averageBusCost;
    private String averageMetroCost;

}
