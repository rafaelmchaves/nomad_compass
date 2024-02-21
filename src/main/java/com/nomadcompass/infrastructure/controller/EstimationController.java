package com.nomadcompass.infrastructure.controller;

import com.nomadcompass.infrastructure.request.EstimationRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Put;

@Controller("/estimation")
public class EstimationController {

    @Put(produces = "application/json", consumes = "application/json")
    public HttpResponse estimate(@Body EstimationRequest estimationRequest) {

        return HttpResponse.ok();
    }

}
