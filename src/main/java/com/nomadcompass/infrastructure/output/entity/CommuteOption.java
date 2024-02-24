package com.nomadcompass.infrastructure.output.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CommuteOption {

    private String name;
    private BigDecimal cost;

}
