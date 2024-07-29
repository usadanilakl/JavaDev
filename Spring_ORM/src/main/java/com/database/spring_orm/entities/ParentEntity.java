package com.database.spring_orm.entities;

import jakarta.persistence.*;
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
public class ParentEntity extends BaseEntity{
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "parent_child",
            joinColumns = @JoinColumn(name="parent_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "child_id",referencedColumnName = "id")
    )
    private List<ChildEntity> childItems;
    @OneToMany(mappedBy = "parent")
    private List<OneParentedChild> oneParentedChildList;

    public ParentEntity(String name, String feature) {
        super(name, feature);
    }
}
