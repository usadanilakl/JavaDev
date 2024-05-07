package com.database.spring_orm.entities.permits.lotos;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.enums.PermitType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class BaseLoto extends BasePermit {
    {this.setType(PermitType.LOTO);}
    @OneToOne(mappedBy = "loto")
    private Box box;
    @OneToMany(mappedBy = "loto")
    private List<Lock> locks;
}
