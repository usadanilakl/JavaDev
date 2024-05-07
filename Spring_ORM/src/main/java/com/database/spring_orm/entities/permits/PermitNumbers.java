package com.database.spring_orm.entities.permits;

import com.database.spring_orm.enums.PermitType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PermitNumbers {
    @Enumerated(EnumType.STRING)
    @Id
    PermitType permitType;
    Long number;
}
