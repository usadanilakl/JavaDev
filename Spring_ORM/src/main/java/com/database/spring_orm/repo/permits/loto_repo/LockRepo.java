package com.database.spring_orm.repo.permits.loto_repo;

import com.database.spring_orm.entities.permits.lotos.Lock;
import org.springframework.data.repository.CrudRepository;

public interface LockRepo extends CrudRepository<Lock,Long> {
}
