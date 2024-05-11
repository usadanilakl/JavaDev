package com.database.spring_orm.repo.permits.loto_repo;

import com.database.spring_orm.entities.permits.lotos.BaseLoto;
import com.database.spring_orm.entities.permits.lotos.Loto;
import com.database.spring_orm.repo.permits.BasePermitRepo;
import org.springframework.data.repository.CrudRepository;

public interface BaseLotoRepo extends BasePermitRepo<Loto> {
}
