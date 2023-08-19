package com.alfakass.alfakassproductservice.domain.product.restcontroller;

import com.alfakass.alfakassproductservice.domain.product.dto.ProductDTO;
import com.alfakass.alfakassproductservice.domain.product.dto.ProductResponseDTO;
import com.alfakass.alfakassproductservice.domain.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(productService.createProduct(productDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> getUsers() {
        return ResponseEntity.ok(productService.getProducts());
    }
}

