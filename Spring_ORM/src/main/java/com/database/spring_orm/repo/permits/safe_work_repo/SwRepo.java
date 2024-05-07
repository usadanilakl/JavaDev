package com.database.spring_orm.repo.permits.safe_work_repo;

import com.database.spring_orm.entities.permits.safe_works.BaseSw;
import com.database.spring_orm.entities.permits.safe_works.Sw;
import org.springframework.data.repository.CrudRepository;

public interface SwRepo extends CrudRepository<Sw,Long> {
}
