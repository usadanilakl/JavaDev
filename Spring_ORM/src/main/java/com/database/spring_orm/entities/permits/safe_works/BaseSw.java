package com.database.spring_orm.entities.permits.safe_works;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.enums.PermitType;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class BaseSw extends BasePermit {
    {this.setType(PermitType.SAFE_WORK);}
}
