package com.nomadcompass.infrastructure.input.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CityResponse {

    private String id;
    private String name;
    private String state;
    private String country;
    private String latitude;
    private String longitude;

}
