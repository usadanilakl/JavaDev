package com.database.spring_orm.service.permits.impl;

import com.database.spring_orm.dto.permits.LotoDto;
import com.database.spring_orm.entities.permits.lotos.Loto;
import com.database.spring_orm.repo.permits.BasePermitRepo;
import com.database.spring_orm.service.FilterService;
import com.database.spring_orm.service.permits.PermitNumbersService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LotoService extends BasePermitServiceImpl<Loto, LotoDto>{

    public LotoService(@Qualifier("baseLotoRepo") BasePermitRepo<Loto> repository, PermitNumbersService permitNumbersService, FilterService<Loto> filterService) {
        super(repository, permitNumbersService, filterService);
    }
}
