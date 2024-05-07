package com.database.spring_orm.repo.permits.safe_work_repo;

import com.database.spring_orm.entities.permits.hot_works.BaseHw;
import com.database.spring_orm.entities.permits.safe_works.BaseSw;
import org.springframework.data.repository.CrudRepository;

public interface BaseSwRepo extends CrudRepository<BaseSw,Long> {
}
