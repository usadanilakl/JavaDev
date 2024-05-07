package com.database.spring_orm.service;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.entities.permits.lotos.Loto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
@Service
@Data
@AllArgsConstructor
public class FilterService <T>{
    private String lastSortingRequest;
    private Boolean ascending = true;
    private List<T> permits;
    private Map<String,String> lastSetOfFileters;
    public Object getFieldByName(T obj, String name){
        try {
            Method method = obj.getClass().getDeclaredMethod(name);
            return method.invoke(obj);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public List<T> filterPermits(String serachValue, String column){
        permits.removeIf(e->!(getFieldByName(e,column)).toString().contains(column));
        return permits;
    }
    public void sortListAsc(String fieldName){
        permits.sort(Comparator.comparing(e->getFieldByName(e,fieldName).toString(), Comparator.nullsLast(Comparator.naturalOrder())));
    }
    public void sortListDsc(String fieldName){
        permits.sort(Comparator.comparing(e->getFieldByName((T)e,fieldName).toString(), Comparator.nullsLast(Comparator.naturalOrder())).reversed());
    }
    public List<T> addItem(T item){
        permits.add(item);
        return permits;
    }


}
