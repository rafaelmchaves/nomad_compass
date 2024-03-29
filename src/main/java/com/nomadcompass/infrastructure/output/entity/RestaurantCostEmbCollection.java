package com.nomadcompass.infrastructure.output.entity;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.math.BigDecimal;

@Serdeable.Deserializable
@Introspected
@Getter
@Setter
public class RestaurantCostEmbCollection {

    @BsonProperty(value = "cheap_meal")
    private BigDecimal cheapMeal;

    @BsonProperty(value = "fancy_meal")
    private BigDecimal fancyMeal;

    @BsonProperty(value = "alcohol_drink")
    private BigDecimal alcoholDrink;

    @BsonProperty(value = "no_alcohol_drink")
    private BigDecimal noAlcoholDrink;

}
