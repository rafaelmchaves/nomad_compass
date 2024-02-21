package com.nomadcompass.infrastructure.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AccommodationResponse {

    private String type;
    private BigDecimal cost;
}
