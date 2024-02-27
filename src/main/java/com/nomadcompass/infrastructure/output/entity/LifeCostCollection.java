package com.nomadcompass.infrastructure.output.entity;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.*;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@MappedEntity(value = "life_cost")
public class LifeCostCollection {

    @Id
    @GeneratedValue
    @BsonId
    @BsonProperty(value = "_id")
    private ObjectId id;

    @BsonProperty(value = "city_id")
    private String cityId;

    @BsonProperty(value = "restaurant_cost")
    private RestaurantCostEmbCollection restaurantCost;

    @BsonProperty(value = "bar_cost")
    private BarCostEmbCollection barCostEmbCollection;

    @BsonProperty(value = "weekly_supermarket_cost")
    private SupermarketCostEmbCollection weeklySupermarketCost;

    @BsonProperty(value = "commute_options")
    private Set<CommuteOptionEmbCollection> commuteOptions;
    private Set<AccommodationEmbCollection> accommodations;
}
