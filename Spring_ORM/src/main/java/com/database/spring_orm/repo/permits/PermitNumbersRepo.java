package com.database.spring_orm.repo.permits;


import com.database.spring_orm.entities.permits.PermitNumbers;
import com.database.spring_orm.enums.PermitType;
import org.springframework.data.repository.CrudRepository;

public interface PermitNumbersRepo extends CrudRepository<PermitNumbers, PermitType> {
}
