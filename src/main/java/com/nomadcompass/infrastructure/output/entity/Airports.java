package com.nomadcompass.infrastructure.output.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Airports {

    private String label;
    private String distanceKm;
    private String averageUberCost;
    private String averageBusCost;
    private String averageMetroCost;

}
