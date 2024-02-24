package com.nomadcompass.infrastructure.input.request;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

@Introspected
@Serdeable.Deserializable
@Getter
@Setter
public class CityInformationRequest {

    private String portuguese;
    private String english;

}
