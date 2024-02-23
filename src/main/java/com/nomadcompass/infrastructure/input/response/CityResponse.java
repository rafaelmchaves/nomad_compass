package com.nomadcompass.infrastructure.input.response;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@Introspected
@Serdeable.Serializable
public class CityResponse {

    private String id;
    private String name;
    private String state;
    private String country;
    private String latitude;
    private String longitude;
    private List<AirportResponse> airports;
    private CityInformationResponse information;

}
