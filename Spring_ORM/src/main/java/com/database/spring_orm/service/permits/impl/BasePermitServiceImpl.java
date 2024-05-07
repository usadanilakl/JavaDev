package com.database.spring_orm.service.permits.impl;

import com.database.spring_orm.dto.permits.BasePermitDto;
import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.enums.Status;
import com.database.spring_orm.repo.permits.BasePermitRepo;
import com.database.spring_orm.service.permits.BasePermitService;
import com.database.spring_orm.util.Util;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class BasePermitServiceImpl implements BasePermitService<BasePermit, BasePermitDto> {
    private final BasePermitRepo repository;

    @Override
    public List<BasePermit> getAll() {
        return Util.toList(repository.findAll());
    }

    @Override
    public List<BasePermit> getAllSorted(String column) {
        return repository.findAll(Sort.by(column));
    }

    @Override
    public BasePermit getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public BasePermit save(BasePermit entity) {
        return repository.save(entity);
    }

    @Override
    public BasePermit createNew(BasePermitDto dto) {
        BasePermit permit = dto.toEntity();

        return null;
    }

    @Override
    public BasePermit changeStatus(Long id, Status status) {
        // Change status of an entity
        return null;
    }

    @Override
    public List<BasePermit> sortTable(String column) {
        return null;
    }

    @Override
    public List<BasePermit> filterTable(Map<String, String> filters) {
        return null;
    }

    @Override
    public List<BasePermit> getLastFilter() {
        return null;
    }

    @Override
    public List<BasePermit> clearFilters() {
        return null;
    }

    @Override
    public void filterNew(BasePermit entity) {

    }
}
