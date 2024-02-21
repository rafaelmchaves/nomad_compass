package com.nomadcompass.infrastructure.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class EstimationResponse {

    private List<DestinationResponse> destinations;
    private BigDecimal totalCostWithAirFlight;
    private BigDecimal totalCostWithCar;
    private BigDecimal totalCostWithBus;
    private BigDecimal totalWithTour;

}
