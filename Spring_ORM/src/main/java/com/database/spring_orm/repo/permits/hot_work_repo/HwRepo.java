package com.database.spring_orm.repo.permits.hot_work_repo;

import com.database.spring_orm.entities.permits.hot_works.BaseHw;
import com.database.spring_orm.entities.permits.hot_works.Hw;
import org.springframework.data.repository.CrudRepository;

public interface HwRepo extends CrudRepository<Hw,Long> {
}
