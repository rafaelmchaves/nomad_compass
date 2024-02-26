package com.nomadcompass.core.model;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class LifeCost {

    private String cityId;
    private RestaurantCost restaurantCost;
    private BarCost barCost;
    private SupermarketCost weeklySupermarketCost;
    private Set<CommuteOption> commuteOptions;
    private Set<Accommodation> accommodations;
}
