package com.database.spring_orm.config;

import com.database.spring_orm.entities.permits.lotos.Loto;
import com.database.spring_orm.entities.permits.safe_works.Sw;
import com.database.spring_orm.entities.permits.tickets.Ticket;
import com.database.spring_orm.repo.permits.BasePermitRepo;
import com.database.spring_orm.service.FilterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterServiceConfig {
    @Autowired
    private BasePermitRepo<Loto> lotoRepo;

    @Autowired
    private BasePermitRepo<Ticket> ticketRepo;

    @Bean
    public FilterService<Loto> entity1FilterService() {
        return new FilterService<>(lotoRepo);
    }

    @Bean
    public FilterService<Ticket> entity2FilterService() {
        return new FilterService<>(ticketRepo);
    }
}
