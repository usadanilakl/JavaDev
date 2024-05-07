package com.database.spring_orm.entities.permits.tickets;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.enums.PermitType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class BaseTicket extends BasePermit {
    {this.setType(PermitType.TICKET);}
    @ManyToMany
    @JoinTable(
            name="ticket_permit",
            joinColumns = @JoinColumn(name="ticket_id"),
            inverseJoinColumns = @JoinColumn(name="permit_id")
    )
    private List<BasePermit> permits;
}
