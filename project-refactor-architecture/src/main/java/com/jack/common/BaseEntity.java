package com.jack.common;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    @Column(name = "DELETED_FLAG")
    private boolean deletedFlag;

}
