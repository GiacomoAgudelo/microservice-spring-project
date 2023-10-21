package com.jack.repository;

import com.jack.entity.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {
}
