package com.nomadcompass.infrastructure.input.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinationRequest {

    private String cityId;
    private String arrivalDate;
    private String endDate;

}
