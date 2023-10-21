package com.jack.assembler;

import com.jack.common.AbstractAssembler;
import com.jack.dto.ProductRequest;
import com.jack.dto.ProductResponse;
import com.jack.entity.ProductionEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductAssembler implements AbstractAssembler<ProductRequest, ProductResponse, ProductionEntity> {

    @Override
    public Optional<ProductionEntity> assembleEntity(final ProductRequest request) {
        ProductionEntity entity =  ProductionEntity
                                        .builder()
                                        .productName(request.getProductName())
                                        .productType(request.getProductType())
                                        .build();
        return Optional.ofNullable(entity);
    }

    @Override
    public Optional<ProductResponse> assembleResponse(final ProductionEntity entity) {
        ProductResponse productResponse = ProductResponse
                                            .builder()
                                            .productName(entity.getProductName())
                                            .productType(entity.getProductType())
                                            .build();
        return Optional.ofNullable(productResponse);
    }

    @Override
    public void merge(ProductionEntity entity, ProductRequest productRequest) {
    }
}
