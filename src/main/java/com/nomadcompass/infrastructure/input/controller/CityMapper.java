package com.nomadcompass.infrastructure.input.controller;

import com.nomadcompass.infrastructure.input.request.AirportRequest;
import com.nomadcompass.infrastructure.input.request.CityInformationRequest;
import com.nomadcompass.infrastructure.input.request.CityRequest;
import com.nomadcompass.infrastructure.input.response.AirportResponse;
import com.nomadcompass.infrastructure.input.response.CityInformationResponse;
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
                .information(informationToInformationResponse(city.getInformation()))
                .airports(airportToAirportResponse(city.getAirports()))
                .build();
    }

    City cityRequestToCity(CityRequest cityRequest) {
        return City.builder()
                .name(cityRequest.getName())
                .state(cityRequest.getState())
                .country(cityRequest.getCountry())
                .longitude(cityRequest.getLongitude())
                .latitude(cityRequest.getLatitude())
                .airports(airportRequestToAirport(cityRequest.getAirports()))
                .information(informationRequestToInformation(cityRequest.getInformation()))
                .build();
    }

    private CityInformation informationRequestToInformation(CityInformationRequest cityInformationRequest) {
        return CityInformation.builder().portuguese(cityInformationRequest.getPortuguese())
                .english(cityInformationRequest.getEnglish())
                .build();
    }

    private List<Airport> airportRequestToAirport(List<AirportRequest> airportRequests) {
        return airportRequests.stream()
                .map(airportRequest -> Airport.builder().label(airportRequest.getLabel())
                        .distanceKm(airportRequest.getDistanceKm())
                        .averageBusCost(airportRequest.getAverageBusCost())
                        .averageMetroCost(airportRequest.getAverageMetroCost())
                        .build()).toList();
    }

    private CityInformationResponse informationToInformationResponse(CityInformation cityInformation) {
        return CityInformationResponse.builder().portuguese(cityInformation.getPortuguese())
                .english(cityInformation.getEnglish())
                .build();
    }

    private List<AirportResponse> airportToAirportResponse(List<Airport> airports) {
        return airports.stream()
                .map(airport -> AirportResponse.builder().label(airport.getLabel())
                        .distanceKm(airport.getDistanceKm())
                        .averageBusCost(airport.getAverageBusCost())
                        .averageMetroCost(airport.getAverageMetroCost())
                        .build()).toList();
    }

}
