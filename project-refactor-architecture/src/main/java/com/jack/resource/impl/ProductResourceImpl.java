package com.jack.resource.impl;

import com.jack.handler.ProductHandler;
import com.jack.dto.ProductRequest;
import com.jack.resource.interf.ProductResource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductResourceImpl implements ProductResource {

    private final ProductHandler productHandler;

    @Override
    public ResponseEntity<?> createProducts(final ProductRequest request) throws Exception {
        productHandler.createProduct(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
