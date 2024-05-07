package com.database.spring_orm.entities.permits.lotos;

import com.database.spring_orm.entities.BaseEntity;
import com.database.spring_orm.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Lock extends BaseEntity {
    private Integer number;
    private Status status;
    @ManyToOne
    @JoinColumn(name = "loto_id")
    private BaseLoto loto;
}
