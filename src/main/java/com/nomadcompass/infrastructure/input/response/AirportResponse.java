package com.nomadcompass.infrastructure.input.response;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Introspected
@Serdeable.Serializable
@Getter
@Setter
public class AirportResponse {

    private String label;
    private BigDecimal distanceKm;
    private BigDecimal averageUberCost;
    private BigDecimal averageBusCost;
    private BigDecimal averageMetroCost;

}
