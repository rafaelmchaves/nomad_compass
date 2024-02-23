package com.nomadcompass.infrastructure.input.controller;

import com.nomadcompass.core.usecase.CityUseCase;
import com.nomadcompass.infrastructure.input.mapper.CityMapper;
import com.nomadcompass.infrastructure.input.request.CityRequest;
import com.nomadcompass.infrastructure.input.response.CityResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Controller("/cities")
public class CitiesController {

    private final CityUseCase cityUseCase;

    private final CityMapper cityMapper;

    @Get(produces = "application/json")
    public HttpResponse<List<CityResponse>> getByQuery(@QueryValue String name) {
        final var cities = this.cityUseCase.getByName(name);
        return HttpResponse.ok(cities.stream().map(cityMapper::cityToCityResponse).collect(Collectors.toList()));
    }

    @Get(produces = "application/json", value = "/{id}")
    public HttpResponse<CityResponse> getById(@PathVariable String id) {
        final var cityResponse = cityMapper.cityToCityResponse(this.cityUseCase.getById(id));
        return HttpResponse.ok(cityResponse);
    }

    @Post(produces = "application/json", consumes = "application/json")
    public HttpResponse<CityResponse> add(@Body CityRequest cityRequest) {
        final var city = cityUseCase.create(cityMapper.cityRequestToCity(cityRequest));
        return HttpResponse.created(cityMapper.cityToCityResponse(city));
    }
}
