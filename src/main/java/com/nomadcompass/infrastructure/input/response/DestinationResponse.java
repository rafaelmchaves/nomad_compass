package com.nomadcompass.infrastructure.input.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class DestinationResponse {

    private List<TransportationOptionsResponse> transportations;
    private List<WeeklyCostResponse> weeklyCosts;
    private List<LeisureResponse> leisureList;
    private List<AccommodationResponse> accommodations;
    private List<TouristicPlacesResponse> touristicPlaces;
    private BigDecimal totalCost;
    private BigDecimal totalTour;
    private BigDecimal accommodationCostAverage;

}
