package com.nomadcompass.core.usecase;

import com.nomadcompass.infrastructure.output.entity.CityCollection;

import java.util.List;

public interface CityUseCase {

    CityCollection getById(String id);
    CityCollection create(CityCollection cityCollection);

    List<CityCollection> getByName(String name);
}
