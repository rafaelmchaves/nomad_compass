package com.nomadcompass.core.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Accommodation {

    private String type;

    private BigDecimal cheapDailyCost;
    private BigDecimal averageDailyCost;
    private BigDecimal fancyDailyCost;
    private BigDecimal cheapMonthlyCost;
    private BigDecimal averageMonthlyCost;
    private BigDecimal fancyMonthlyCost;

}
