package com.jack.handler;

import com.jack.dto.ProductRequest;
import com.jack.service.interf.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductHandler {

    private final ProductService productService;

    public void createProduct(final @NonNull ProductRequest request) throws Exception {
        productService.createProduct(request);
    }
}
