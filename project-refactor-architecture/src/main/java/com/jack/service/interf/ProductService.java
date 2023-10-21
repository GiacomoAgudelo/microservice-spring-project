package com.jack.service.interf;

import com.jack.dto.ProductRequest;
import org.springframework.lang.NonNull;

public interface ProductService {

    void createProduct(final @NonNull ProductRequest request) throws Exception;

}
