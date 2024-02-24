package com.nomadcompass.infrastructure.output.entity;

import io.micronaut.data.annotation.MappedEntity;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@MappedEntity(value = "life_cost")
public class LifeCost {

    private String cityId;
    private RestaurantCost restaurantCost;
    private BarCost barCost;
    private SupermarketCost weeklySupermarketCost;
    private Set<CommuteOption> commuteOptions;
    private Set<Accommodation> accommodations;
}
