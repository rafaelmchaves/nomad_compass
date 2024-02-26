package com.nomadcompass.infrastructure.input.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class EstimationResponse {

    private List<DestinationResponse> destinations;
    private BigDecimal totalCost;
    private BigDecimal totalWithTour;

}
