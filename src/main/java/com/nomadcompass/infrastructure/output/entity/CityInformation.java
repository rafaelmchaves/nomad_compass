package com.nomadcompass.infrastructure.output.entity;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Serdeable.Deserializable
@Serdeable.Serializable
@Introspected
@Builder
@Getter
@Setter
public class CityInformation {

    private String portuguese;
    private String english;

}
