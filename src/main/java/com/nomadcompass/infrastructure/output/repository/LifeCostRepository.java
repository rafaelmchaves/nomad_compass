package com.nomadcompass.infrastructure.output.repository;

import com.nomadcompass.infrastructure.output.entity.LifeCostCollection;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;
import org.bson.types.ObjectId;

@MongoRepository
public interface LifeCostRepository extends CrudRepository<LifeCostCollection, ObjectId> {

    LifeCostCollection findByCityId(String cityId);
}
