package com.nomadcompass.infrastructure.output.entity;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Builder;
import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.time.LocalDateTime;

@Getter
@Builder
@MappedEntity(value = "cities")
public class City {

    @Id
    @GeneratedValue
    @BsonId
    @BsonProperty(value = "_id")
    private String id;

    private String name;
    private String state;
    private String country;
    private String latitude;
    private String longitude;
    private LocalDateTime creationDate;

}
