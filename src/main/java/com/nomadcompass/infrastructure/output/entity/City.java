package com.nomadcompass.infrastructure.output.entity;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.*;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@MappedEntity(value = "cities")
public class City {

    @Id
    @GeneratedValue
    @BsonId
    @BsonProperty(value = "_id")
    private ObjectId id;

    private String name;
    private String state;
    private String country;
    private String latitude;
    private String longitude;
    private LocalDateTime creationDate;
    private List<Airport> airports;
    private CityInformation information;

}
