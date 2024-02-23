package com.nomadcompass.infrastructure.output.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CityInformation {

    private String portuguese;
    private String english;

}
