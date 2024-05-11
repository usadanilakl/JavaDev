package com.database.spring_orm.dto.permits;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.entities.permits.tickets.Ticket;

public class TicketDto extends BasePermitDto<Ticket>{
    @Override
    public Ticket toEntity() {
        return null;
    }
}
