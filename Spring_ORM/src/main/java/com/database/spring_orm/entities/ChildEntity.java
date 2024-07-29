package com.database.spring_orm.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Where(clause = "is_Deleted=false")
public class ChildEntity extends BaseEntity{
    @ManyToMany(mappedBy = "childItems")
    private List<ParentEntity> parentItems;


    public ChildEntity(String name, String feature) {
        super(name, feature);
    }
}
