package com.database.spring_orm.entities.permits.hot_works;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.enums.PermitType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class BaseHw extends BasePermit {
    {this.setType(PermitType.HOT_WORK);}
}
