package com.jack.resource.interf;

import com.jack.dto.ProductRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("v1/api/products")
public interface ProductResource {

    @PostMapping(value = "", produces = "application/json", consumes = "application/json")
    ResponseEntity<?> createProducts(final @RequestBody ProductRequest request) throws Exception;
}
