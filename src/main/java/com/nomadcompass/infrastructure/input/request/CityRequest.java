package com.nomadcompass.infrastructure.input.request;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Introspected
@Serdeable.Deserializable
public class CityRequest {

    private String name;
    private String state;
    private String country;
    private String latitude;
    private String longitude;
}
