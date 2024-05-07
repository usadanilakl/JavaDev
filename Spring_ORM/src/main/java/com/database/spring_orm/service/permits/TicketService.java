package com.database.spring_orm.service.permits;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.entities.permits.tickets.Ticket;
import com.database.spring_orm.repo.permits.BasePermitRepo;
import com.database.spring_orm.repo.permits.ticket_repo.TicketRepo;
import com.database.spring_orm.service.FilterService;
import com.database.spring_orm.service.permits.impl.BasePermitServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class TicketService extends BasePermitServiceImpl{
    private final TicketRepo ticketRepo;

    public TicketService(BasePermitRepo repository, PermitNumbersService permitNumbersService, FilterService<BasePermit> filterService, TicketRepo ticketRepo) {
        super(repository, permitNumbersService, filterService);
        this.ticketRepo = ticketRepo;
    }

}
