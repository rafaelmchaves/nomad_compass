package com.nomadcompass.infrastructure.input.response;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Introspected
@Serdeable.Serializable
@Getter
@Setter
public class CityInformationResponse {

    private String portuguese;
    private String english;

}
