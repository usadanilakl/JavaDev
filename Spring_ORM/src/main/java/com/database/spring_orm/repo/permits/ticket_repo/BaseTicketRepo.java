package com.database.spring_orm.repo.permits.ticket_repo;

import com.database.spring_orm.entities.permits.safe_works.BaseSw;
import com.database.spring_orm.entities.permits.tickets.BaseTicket;
import com.database.spring_orm.entities.permits.tickets.Ticket;
import com.database.spring_orm.repo.permits.BasePermitRepo;
import org.springframework.data.repository.CrudRepository;

public interface BaseTicketRepo extends BasePermitRepo<Ticket> {
}
