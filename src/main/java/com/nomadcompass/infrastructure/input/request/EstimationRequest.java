package com.nomadcompass.infrastructure.input.request;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class EstimationRequest {

    private String rootCityId;
    private List<DestinationRequest> destinations;
    private Integer amountDaysPerWeekRestaurant;
    private Integer amountDaysPerWeekBar;
    private Integer transportation;
    private Integer uber;

}
