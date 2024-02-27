package com.nomadcompass.infrastructure.output.repository;

import com.nomadcompass.infrastructure.output.entity.CityCollection;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;
import org.bson.types.ObjectId;

import java.util.List;

@MongoRepository
public interface CityRepository extends CrudRepository<CityCollection, ObjectId> {

    List<CityCollection> findByNameLike(String name);
}
