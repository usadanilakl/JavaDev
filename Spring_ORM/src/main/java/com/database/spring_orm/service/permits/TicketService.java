package com.database.spring_orm.service.permits;

import com.database.spring_orm.dto.permits.TicketDto;
import com.database.spring_orm.entities.permits.tickets.Ticket;
import com.database.spring_orm.repo.permits.ticket_repo.TicketRepo;
import com.database.spring_orm.service.permits.impl.BasePermitServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class TicketService extends BasePermitServiceImpl<Ticket, TicketDto> {
    private final TicketRepo ticketRepo;

    public TicketService(TicketRepo ticketRepo) {
        super(ticketRepo);
        this.ticketRepo = ticketRepo;
    }


    @Override
    public List<Ticket> sortTable(String column) {
        return null;
    }

    @Override
    public List<Ticket> filterTable(Map<String, String> filters) {
        return null;
    }

    @Override
    public List<Ticket> getLastFilter() {
        return null;
    }

    @Override
    public List<Ticket> clearFilters() {
        return null;
    }

    @Override
    public void filterNew(Ticket entity) {

    }
}
