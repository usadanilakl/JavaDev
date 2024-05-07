package com.database.spring_orm.repo.permits.hot_work_repo;

import com.database.spring_orm.entities.permits.hot_works.BaseHw;
import com.database.spring_orm.entities.permits.lotos.BaseLoto;
import org.springframework.data.repository.CrudRepository;

public interface BaseHwRepo extends CrudRepository<BaseHw,Long> {
}
