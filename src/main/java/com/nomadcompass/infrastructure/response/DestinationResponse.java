package com.nomadcompass.infrastructure.response;

import com.nomadcompass.infrastructure.request.DestinationRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DestinationResponse {

    private List<TransportationOptionsResponse> transportations;
    private List<WeeklyCostResponse> weeklyCosts;
    private List<LeisureResponse> leisureList;
    private List<AccommodationResponse> accommodations;
    private List<TouristicPlacesResponse> touristicPlaces;


}
