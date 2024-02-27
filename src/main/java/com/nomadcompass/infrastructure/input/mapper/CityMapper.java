package com.nomadcompass.infrastructure.input.mapper;

import com.nomadcompass.infrastructure.input.request.AirportRequest;
import com.nomadcompass.infrastructure.input.request.CityInformationRequest;
import com.nomadcompass.infrastructure.input.request.CityRequest;
import com.nomadcompass.infrastructure.input.response.AirportResponse;
import com.nomadcompass.infrastructure.input.response.CityInformationResponse;
import com.nomadcompass.infrastructure.input.response.CityResponse;
import com.nomadcompass.infrastructure.output.entity.AirportEmbCollection;
import com.nomadcompass.infrastructure.output.entity.CityCollection;
import com.nomadcompass.infrastructure.output.entity.CityInformationEmbCollection;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class CityMapper {

    public CityResponse cityToCityResponse(CityCollection cityCollection) {
        return CityResponse.builder().id(cityCollection.getId().toString())
                .name(cityCollection.getName())
                .state(cityCollection.getState())
                .country(cityCollection.getCountry())
                .longitude(cityCollection.getLongitude())
                .latitude(cityCollection.getLatitude())
                .information(informationToInformationResponse(cityCollection.getInformation()))
                .airports(airportToAirportResponse(cityCollection.getAirports()))
                .build();
    }

    public CityCollection cityRequestToCity(CityRequest cityRequest) {
        return CityCollection.builder()
                .name(cityRequest.getName())
                .state(cityRequest.getState())
                .country(cityRequest.getCountry())
                .longitude(cityRequest.getLongitude())
                .latitude(cityRequest.getLatitude())
                .airports(airportRequestToAirport(cityRequest.getAirports()))
                .information(informationRequestToInformation(cityRequest.getInformation()))
                .build();
    }

    private CityInformationEmbCollection informationRequestToInformation(CityInformationRequest cityInformationRequest) {
        return CityInformationEmbCollection.builder().portuguese(cityInformationRequest.getPortuguese())
                .english(cityInformationRequest.getEnglish())
                .build();
    }

    private List<AirportEmbCollection> airportRequestToAirport(List<AirportRequest> airportRequests) {
        return airportRequests.stream()
                .map(airportRequest -> AirportEmbCollection.builder().label(airportRequest.getLabel())
                        .distanceKm(airportRequest.getDistanceKm())
                        .averageBusCost(airportRequest.getAverageBusCost())
                        .averageMetroCost(airportRequest.getAverageMetroCost())
                        .build()).toList();
    }

    private CityInformationResponse informationToInformationResponse(CityInformationEmbCollection cityInformation) {
        return CityInformationResponse.builder().portuguese(cityInformation.getPortuguese())
                .english(cityInformation.getEnglish())
                .build();
    }

    private List<AirportResponse> airportToAirportResponse(List<AirportEmbCollection> airports) {
        return airports.stream()
                .map(airport -> AirportResponse.builder().label(airport.getLabel())
                        .distanceKm(airport.getDistanceKm())
                        .averageBusCost(airport.getAverageBusCost())
                        .averageMetroCost(airport.getAverageMetroCost())
                        .build()).toList();
    }

}
