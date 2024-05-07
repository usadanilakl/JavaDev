package com.database.spring_orm.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
public class BaseEntity {
//    @CreatedDate
//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDateTime dateCreated;
//    @LastModifiedDate
//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDateTime dateModified;
//    @CreatedBy
//    private String createdBy;
//    @LastModifiedBy
//    private String modifiedBy;

    private String createdBy;
    @Id
    @GeneratedValue
    private Long id;

//    public BaseEntity(String createdBy) {
//        this.createdBy = createdBy;
//    }
}
