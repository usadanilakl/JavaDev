package com.database.spring_orm.repo;

import com.database.spring_orm.entities.OneParentedChild;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OneParentedChildRepo extends JpaRepository<OneParentedChild,Long> {
}
