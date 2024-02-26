package com.nomadcompass.infrastructure.output.repository;

import com.nomadcompass.infrastructure.output.entity.LifeCost;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;
import org.bson.types.ObjectId;

@MongoRepository
public interface LifeCostRepository extends CrudRepository<LifeCost, ObjectId> {

    LifeCost findByCityId(String cityId);
}
