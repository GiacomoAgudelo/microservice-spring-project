package com.jack.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class BookEntity {

    @Id
    @Column(name = "id", insertable = true, updatable = false)
    private Long id;

    @Column(name = "name", insertable = true, updatable = false)
    private String name;

    @Column(name = "price")
    private Long price;

}
