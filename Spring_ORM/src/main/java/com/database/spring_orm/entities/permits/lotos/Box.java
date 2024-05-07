package com.database.spring_orm.entities.permits.lotos;

import com.database.spring_orm.entities.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Box extends BaseEntity {
    private Integer number;
    @OneToOne
    @JoinColumn(name = "loto_id")
    private BaseLoto loto;
}
