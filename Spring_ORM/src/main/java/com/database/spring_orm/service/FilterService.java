package com.database.spring_orm.service;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.repo.permits.BasePermitRepo;
import com.database.spring_orm.util.Util;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Data
public class FilterService <T extends BasePermit>{
    private String lastSortingRequest;
    private Boolean ascending = true;
    private List<T> permits;
    private Map<String,String> lastSetOfFileters;
    private final BasePermitRepo<T> basePermitRepo;

    public FilterService(BasePermitRepo<T> basePermitRepo) {
        this.basePermitRepo = basePermitRepo;
        this.lastSortingRequest = "";
        this.ascending = true;
        this.permits = Util.toList(basePermitRepo.findAll());
        this.lastSetOfFileters = null;
    }

    public Object getFieldByName(T obj, String name){
        try {
            Method method = obj.getClass().getMethod(name);
            if(method.invoke(obj)!=null) return method.invoke(obj);
            else return "";
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public List<T> filterPermits(String serachValue, String column){
        permits.removeIf(e->!(getFieldByName(e,column)).toString().contains(serachValue));
        return permits;
    }
    public void sortListAsc(String fieldName){
        permits.sort(Comparator.comparing(e->getFieldByName(e,fieldName).toString(), Comparator.nullsLast(Comparator.naturalOrder())));
    }
    public void sortListDsc(String fieldName){
        permits.sort(Comparator.comparing(e-> Optional.of(getFieldByName((T)e,fieldName)).orElse("null").toString(), Comparator.nullsLast(Comparator.naturalOrder())).reversed());
    }
    public List<T> addItem(T item){
        permits.add(item);
        return permits;
    }




}
