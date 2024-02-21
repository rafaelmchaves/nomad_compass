package com.nomadcompass.infrastructure.input.controller;

import com.nomadcompass.infrastructure.input.request.EstimationRequest;
import com.nomadcompass.infrastructure.input.response.EstimationResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Put;

@Controller("/calculate-estimate")
public class EstimationController {

    @Put(produces = "application/json", consumes = "application/json")
    public HttpResponse<EstimationResponse> estimate(@Body EstimationRequest estimationRequest) {

        return HttpResponse.ok();
    }

}
