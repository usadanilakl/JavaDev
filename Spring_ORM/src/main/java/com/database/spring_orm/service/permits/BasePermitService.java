package com.database.spring_orm.service.permits;

import com.database.spring_orm.enums.Status;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Map;

public interface BasePermitService<T,D> {
    List<T> getAll();
    List<T> getAllSorted(String column);
    T getById(Long id);
    T save(T entity);
    T createNew(D dto);
    T changeStatus(Long id, Status status);
    List<T> sortTable(String column);
    List<T> filterTable(Map<String,String> filters);
    List<T> getLastFilter();
    List<T> clearFilters();
    void filterNew(T entity);
}
