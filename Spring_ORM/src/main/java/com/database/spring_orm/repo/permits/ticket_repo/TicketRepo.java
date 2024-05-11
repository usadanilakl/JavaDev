package com.database.spring_orm.repo.permits.ticket_repo;

import com.database.spring_orm.entities.permits.tickets.BaseTicket;
import com.database.spring_orm.entities.permits.tickets.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends BaseTicketRepo {
}
