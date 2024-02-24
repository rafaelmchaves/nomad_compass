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
public class LifeCost {

    @Id
    @GeneratedValue
    @BsonId
    @BsonProperty(value = "_id")
    private ObjectId id;

    @BsonProperty(value = "city_id")
    private String cityId;

    @BsonProperty(value = "restaurant_cost")
    private RestaurantCost restaurantCost;

    @BsonProperty(value = "bar_cost")
    private BarCost barCost;

    @BsonProperty(value = "weekly_supermarket_cost")
    private SupermarketCost weeklySupermarketCost;

    @BsonProperty(value = "commute_options")
    private Set<CommuteOption> commuteOptions;
    private Set<Accommodation> accommodations;
}
