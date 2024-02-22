package com.nomadcompass.core.usecase;

import com.nomadcompass.infrastructure.output.entity.City;

public interface CityUseCase {

    City getById(String id);
    City create(City city);
}
