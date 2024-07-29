package com.database.spring_orm.repo;

import com.database.spring_orm.entities.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepo extends JpaRepository<ParentEntity, Long> {
}
