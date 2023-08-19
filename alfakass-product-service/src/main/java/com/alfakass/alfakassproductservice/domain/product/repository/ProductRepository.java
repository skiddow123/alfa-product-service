package com.alfakass.alfakassproductservice.domain.product.repository;

import com.alfakass.alfakassproductservice.domain.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
