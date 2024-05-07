package com.database.spring_orm.entities.permits.tickets;

import com.database.spring_orm.entities.permits.BasePermit;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Ticket extends BaseTicket {
}
