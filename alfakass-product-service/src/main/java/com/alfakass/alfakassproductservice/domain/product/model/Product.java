package com.alfakass.alfakassproductservice.domain.product.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "product")
public class Product {
    @Id
    String id;
    String name;
    String description;
    BigDecimal price;
}
