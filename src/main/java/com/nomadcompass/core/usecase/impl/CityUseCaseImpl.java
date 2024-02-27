package com.nomadcompass.core.usecase.impl;

import com.nomadcompass.core.usecase.CityUseCase;
import com.nomadcompass.infrastructure.output.entity.CityCollection;
import com.nomadcompass.infrastructure.output.repository.CityRepository;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Singleton
public class CityUseCaseImpl implements CityUseCase {

    private final CityRepository cityRepository;

    @Override
    public CityCollection getById(String id) {
        return this.cityRepository.findById(new ObjectId(id)).orElse(new CityCollection());
    }

    @Override
    public CityCollection create(CityCollection cityCollection) {
        cityCollection.setCreationDate(LocalDateTime.now());
        return this.cityRepository.save(cityCollection);
    }

    @Override
    public List<CityCollection> getByName(String name) {
       return this.cityRepository.findByNameLike(name);
    }

}
