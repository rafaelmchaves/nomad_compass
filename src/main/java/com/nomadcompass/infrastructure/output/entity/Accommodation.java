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
public class Accommodation {

    private String type;

    @BsonProperty(value = "cheap_daily_cost")
    private BigDecimal cheapDailyCost;

    @BsonProperty(value = "average_daily_cost")
    private BigDecimal averageDailyCost;

    @BsonProperty(value = "fancy_daily_cost")
    private BigDecimal fancyDailyCost;

    @BsonProperty(value = "cheap_monthly_cost")
    private BigDecimal cheapMonthlyCost;

    @BsonProperty(value = "average_monthly_cost")
    private BigDecimal averageMonthlyCost;

    @BsonProperty(value = "fancy_monthly_cost")
    private BigDecimal fancyMonthlyCost;

}
