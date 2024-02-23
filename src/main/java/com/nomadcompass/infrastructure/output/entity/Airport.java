package com.nomadcompass.infrastructure.output.entity;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Serdeable.Serializable
@Serdeable.Deserializable
@Introspected
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
