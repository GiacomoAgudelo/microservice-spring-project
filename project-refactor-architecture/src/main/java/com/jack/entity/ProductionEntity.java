package com.jack.entity;

import com.jack.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProductionEntity extends BaseEntity {


    @Column(insertable = true, updatable = true, nullable = false)
    private String productName;

    @Column(insertable = true, updatable = true, nullable = false)
    private String productType;

}
