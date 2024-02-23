package com.nomadcompass.infrastructure.input.controller;

import com.nomadcompass.infrastructure.input.request.CityRequest;
import com.nomadcompass.infrastructure.input.response.CityResponse;
import com.nomadcompass.infrastructure.output.entity.Airport;
import com.nomadcompass.infrastructure.output.entity.City;
import com.nomadcompass.infrastructure.output.entity.CityInformation;
import jakarta.inject.Singleton;

import java.util.List;

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
                .airports(airportRequestToAirport(cityRequest))
                .information(informationRequestToInformation(cityRequest))
                .build();
    }

    private static CityInformation informationRequestToInformation(CityRequest cityRequest) {
        return CityInformation.builder().portuguese(cityRequest.getInformation().getPortuguese())
                .english(cityRequest.getInformation().getEnglish())
                .build();
    }

    private static List<Airport> airportRequestToAirport(CityRequest cityRequest) {
        return cityRequest.getAirports().stream()
                .map(airportsRequest -> Airport.builder().label(airportsRequest.getLabel())
                        .distanceKm(airportsRequest.getDistanceKm())
                        .averageBusCost(airportsRequest.getAverageBusCost())
                        .averageMetroCost(airportsRequest.getAverageMetroCost())
                        .build()).toList();
    }

}
