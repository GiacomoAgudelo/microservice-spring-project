package com.jack.repository;

import com.jack.common.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionRepository<Entity extends BaseEntity, ID> extends JpaRepository<Entity, ID> {
}
