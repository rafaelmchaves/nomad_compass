package com.nomadcompass.infrastructure.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DestinationResponse {

    List<TransportationOptionsResponse> transportations;

}
