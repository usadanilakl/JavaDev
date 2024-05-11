package com.database.spring_orm.service.permits.impl;

import com.database.spring_orm.dto.permits.TicketDto;
import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.entities.permits.tickets.Ticket;
import com.database.spring_orm.repo.permits.BasePermitRepo;
import com.database.spring_orm.repo.permits.ticket_repo.TicketRepo;
import com.database.spring_orm.service.FilterService;
import com.database.spring_orm.service.permits.PermitNumbersService;
import com.database.spring_orm.service.permits.impl.BasePermitServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class TicketService extends BasePermitServiceImpl<Ticket, TicketDto>{
    private final TicketRepo ticketRepo;

    public TicketService(@Qualifier("baseTicketRepo") BasePermitRepo<Ticket> repository, PermitNumbersService permitNumbersService, FilterService<Ticket> filterService, TicketRepo ticketRepo) {
        super(repository, permitNumbersService, filterService);
        this.ticketRepo = ticketRepo;
    }

}
