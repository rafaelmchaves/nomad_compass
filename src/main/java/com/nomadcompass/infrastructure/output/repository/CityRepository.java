package com.nomadcompass.infrastructure.output.repository;

import com.nomadcompass.infrastructure.output.entity.City;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;
import org.bson.types.ObjectId;

import java.util.List;

@MongoRepository
public interface CityRepository extends CrudRepository<City, ObjectId> {

    List<City> findByNameLike(String name);
}
