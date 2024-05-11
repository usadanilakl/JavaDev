package com.database.spring_orm.service.permits.impl;

import com.database.spring_orm.dto.permits.BasePermitDto;
import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.entities.permits.lotos.Loto;
import com.database.spring_orm.enums.Status;
import com.database.spring_orm.repo.permits.BasePermitRepo;
import com.database.spring_orm.service.FilterService;
import com.database.spring_orm.service.permits.BasePermitService;
import com.database.spring_orm.service.permits.PermitNumbersService;
import com.database.spring_orm.util.Util;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class BasePermitServiceImpl <T extends BasePermit,D extends BasePermitDto<T>> implements BasePermitService<T, D> {
    private final BasePermitRepo<T> repository;
    protected PermitNumbersService permitNumbersService;
    private final FilterService<T> filterService;

    @Override
    public List<T> getAll() {
        return Util.toList(repository.findAll());
    }

    @Override
    public List<T> getAllSorted(String column) {
        return repository.findAll(Sort.by(column));
    }

    @Override
    public T getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public T createNew(D dto) {
        T permit = dto.toEntity();
        permit.setDocNum(permitNumbersService.getNumber(permit.getType()));
        permit.setStatus(Status.INCATCIVE);
        return null;
    }

    @Override
    public T changeStatus(Long id, Status status) {
        T permit = getById(id);
        permit.setStatus(status);
        return permit;
    }

    @Override
    public List<T> sortTable(String column) {
        if(filterService.getPermits()==null) filterService.setPermits(getAll());
        if(filterService.getLastSortingRequest()!=null && filterService.getLastSortingRequest().equals(column)){
            if(filterService.getAscending()) filterService.setAscending(false);
            else filterService.setAscending(true);
        }
        if(filterService.getAscending()){
            filterService.sortListAsc(column);
        }else {
            filterService.sortListDsc(column);
        }
        filterService.setLastSortingRequest(column);
        return filterService.getPermits();
    }

    @Override
    public List<T> filterTable(Map<String, String> filters) {
        filterService.setPermits(getAll());
        filterService.setLastSetOfFileters(filters);
        for(Map.Entry<String,String> e : filters.entrySet()){
            filterService.filterPermits(e.getValue(),e.getKey());
        }
        return filterService.getPermits();
    }

    @Override
    public List<T> getLastFilteredList() {
        if(filterService.getPermits()==null) filterService.setPermits(getAll());
        return filterService.getPermits();
    }

    @Override
    public List<T> clearFilters() {
        filterService.setPermits(getAll());
        return filterService.getPermits();
    }

    @Override
    public void filterNew(T entity) {
        boolean contains = true;
        if(filterService.getLastSetOfFileters()!=null){
            for(Map.Entry<String,String> e : filterService.getLastSetOfFileters().entrySet()){
                if(!filterService.getFieldByName(entity,e.getKey()).toString().contains(e.getValue())) contains = false;
            }
        }
        if(filterService.getPermits()!=null){
            for (BasePermit el : filterService.getPermits()) {
                if(el.getId().equals(entity.getId())){
                    el.copy(entity);
                    return;
                }
            }
        }
        if(contains)filterService.addItem(entity);
    }

    public List<T> getTestList(){
        return filterService.getPermits();
    }
}
