package com.nomadcompass.infrastructure.input.request;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

@Introspected
@Serdeable.Deserializable
@Getter
@Setter
public class AirportsRequest {

    private String label;
    private String distanceKm;
    private String averageUberCost;
    private String averageBusCost;
    private String averageMetroCost;

}
