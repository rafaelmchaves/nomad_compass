package com.nomadcompass.infrastructure.input.request;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Introspected
@Serdeable.Deserializable
@Getter
@Setter
public class AirportsRequest {

    private String label;
    private BigDecimal distanceKm;
    private BigDecimal averageUberCost;
    private BigDecimal averageBusCost;
    private BigDecimal averageMetroCost;

}
