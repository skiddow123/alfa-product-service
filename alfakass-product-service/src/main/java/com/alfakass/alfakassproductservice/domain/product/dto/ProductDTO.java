package com.alfakass.alfakassproductservice.domain.product.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO {
    String name;
    String description;
    BigDecimal price;
}
