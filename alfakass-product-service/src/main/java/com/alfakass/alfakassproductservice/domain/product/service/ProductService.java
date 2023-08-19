package com.alfakass.alfakassproductservice.domain.product.service;

import com.alfakass.alfakassproductservice.domain.product.dto.ProductDTO;
import com.alfakass.alfakassproductservice.domain.product.dto.ProductResponseDTO;
import com.alfakass.alfakassproductservice.domain.product.model.Product;
import com.alfakass.alfakassproductservice.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponseDTO createProduct(ProductDTO productDTO) {
        Product product = Product.builder()
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .build();

        Product savedProduct = productRepository.save(product);
        log.info("POST: [Success] ==> product with name [{}] has been created", savedProduct.getName());

        return mapProductToProductResponseDTO(savedProduct);
    }

    public List<ProductResponseDTO> getProducts() {
        log.info("GET: [Success] ==> Retrieved all product");
        return productRepository
                .findAll()
                .stream()
                .map(this::mapProductToProductResponseDTO).toList();
    }

    private ProductResponseDTO mapProductToProductResponseDTO(Product product) {
        return ProductResponseDTO
                .builder().id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
