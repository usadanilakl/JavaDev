package com.database.spring_orm.repo.permits;

import com.database.spring_orm.entities.permits.BasePermit;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BasePermitRepo <T extends BasePermit> extends CrudRepository<T,Long> {
    List<T> findAll(Sort sortBy);
}
