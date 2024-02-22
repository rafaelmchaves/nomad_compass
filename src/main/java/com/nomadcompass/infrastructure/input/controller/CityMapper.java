package com.nomadcompass.infrastructure.input.controller;

import com.nomadcompass.infrastructure.input.request.CityRequest;
import com.nomadcompass.infrastructure.input.response.CityResponse;
import com.nomadcompass.infrastructure.output.entity.City;
import jakarta.inject.Singleton;

@Singleton
public class CityMapper {

    CityResponse cityToCityResponse(City city) {
        return CityResponse.builder().id(city.getId().toString())
                .name(city.getName())
                .state(city.getState())
                .country(city.getCountry())
                .longitude(city.getLongitude())
                .latitude(city.getLatitude())
                .build();
    }

    City cityRequestToCity(CityRequest cityRequest) {
        return City.builder()
                .name(cityRequest.getName())
                .state(cityRequest.getState())
                .country(cityRequest.getCountry())
                .longitude(cityRequest.getLongitude())
                .latitude(cityRequest.getLatitude())
                .build();
    }

}
