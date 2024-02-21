package com.nomadcompass.infrastructure.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DestinationResponse {

    private List<TransportationOptionsResponse> transportations;
    private List<WeeklyCostResponse> weeklyCosts;
    private List<LeisureResponse> leisureList;

}
