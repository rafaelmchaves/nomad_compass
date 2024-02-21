package com.nomadcompass.infrastructure.input.controller;

import com.nomadcompass.infrastructure.input.response.CityResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.QueryValue;

@Controller("/cities")
public class CitiesController {

    @Get(produces = "application/json")
    public HttpResponse<CityResponse> getByQuery(@QueryValue String name) {

        return HttpResponse.ok();
    }

    @Get(produces = "application/json", value = "/{id}")
    public HttpResponse<CityResponse> getById(@PathVariable String id) {

        return HttpResponse.ok();
    }
}
