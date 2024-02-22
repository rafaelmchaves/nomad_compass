package com.nomadcompass.core.usecase;

import com.nomadcompass.infrastructure.output.entity.City;

import java.util.List;

public interface CityUseCase {

    City getById(String id);
    City create(City city);

    List<City> getByName(String name);
}
