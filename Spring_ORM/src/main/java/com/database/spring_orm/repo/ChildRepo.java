package com.database.spring_orm.repo;

import com.database.spring_orm.entities.ChildEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepo extends JpaRepository<ChildEntity, Long> {
}
