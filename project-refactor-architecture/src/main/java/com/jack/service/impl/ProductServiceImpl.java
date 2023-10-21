package com.jack.service.impl;


import com.jack.assembler.ProductAssembler;
import com.jack.common.AbstractService;
import com.jack.dto.ProductRequest;
import com.jack.dto.ProductResponse;
import com.jack.entity.ProductionEntity;
import com.jack.repository.ProductionRepository;
import com.jack.service.interf.ProductService;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductServiceImpl extends AbstractService<ProductionEntity, ProductRequest, ProductResponse, Long> implements ProductService   {


    public ProductServiceImpl(final ProductAssembler productAssembler, ProductionRepository productionRepository) {
        super(productAssembler, productionRepository);
    }

    @Override
    public void createProduct(final @NonNull ProductRequest request) throws Exception {
        super.createRecord(request);
    }

    @Override
    public ProductResponse createRecord(ProductRequest Input) {
        return null;
    }

    @Override
    public ProductResponse retriveRecord(Long aLong) {
        return null;
    }

    @Override
    public Collection<ProductResponse> retriveRecords(Collection<Long> longs) {
        return null;
    }

    @Override
    public ProductResponse updateRecord(ProductRequest productRequest, Long aLong) {
        return null;
    }

    @Override
    public Collection<ProductResponse> updateRecords(Collection<ProductionEntity> entity) {
        return null;
    }
}
