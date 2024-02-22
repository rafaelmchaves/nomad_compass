package com.nomadcompass.core.usecase.impl;

import com.nomadcompass.core.usecase.CityUseCase;
import com.nomadcompass.infrastructure.output.entity.City;
import com.nomadcompass.infrastructure.output.repository.CityRepository;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Singleton
public class CityUseCaseImpl implements CityUseCase {

    private final CityRepository cityRepository;

    @Override
    public City getById(String id) {
        return this.cityRepository.findById(new ObjectId(id)).orElse(new City());
    }

    @Override
    public City create(City city) {
        city.setCreationDate(LocalDateTime.now());
        return this.cityRepository.save(city);
    }

}
