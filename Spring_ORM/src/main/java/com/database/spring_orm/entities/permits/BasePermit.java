package com.database.spring_orm.entities.permits;

import com.database.spring_orm.dto.permits.BasePermitDto;
import com.database.spring_orm.entities.BaseEntity;
import com.database.spring_orm.entities.permits.tickets.BaseTicket;
import com.database.spring_orm.entities.permits.tickets.Ticket;
import com.database.spring_orm.enums.PermitType;
import com.database.spring_orm.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BasePermit extends BaseEntity {
    private String workScope;
    private String system;
    private String equipment;
    private String requestor;
    private String controlAuthority;
    @Enumerated(EnumType.STRING)
    private PermitType type;
    private Long docNum;
    private Status status;
    @ManyToMany(mappedBy = "permits")
    private List<BaseTicket> tickets;

    public void copy(BasePermit other) {
        this.requestor = other.getRequestor();
        this.controlAuthority = other.getControlAuthority();
        this.system = other.getSystem();
        this.workScope = other.getWorkScope();
        this.equipment = other.getEquipment();
    }
    public BasePermitDto toDto(){
        return new BasePermitDto(this.workScope, this.system,this.equipment,this.requestor, this.controlAuthority, this.type, this.docNum, this.status, this.tickets,this.getCreatedBy());
    }
}
