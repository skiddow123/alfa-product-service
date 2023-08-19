package com.alfakass.alfakassproductservice.domain.product.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProductResponseDTO {
    String id;
    String name;
    String description;
    BigDecimal price;
}
