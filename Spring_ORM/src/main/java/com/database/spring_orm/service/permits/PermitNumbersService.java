package com.database.spring_orm.service.permits;


import com.database.spring_orm.entities.permits.PermitNumbers;
import com.database.spring_orm.enums.PermitType;

public interface PermitNumbersService {
    Long getNumber(PermitType type);
    Long generate(Long lastCreatedNumber);
    PermitNumbers saveNumber(PermitNumbers num);
}
