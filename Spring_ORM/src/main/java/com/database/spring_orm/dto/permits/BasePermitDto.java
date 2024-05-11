package com.database.spring_orm.dto.permits;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.entities.permits.tickets.BaseTicket;
import com.database.spring_orm.enums.PermitType;
import com.database.spring_orm.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class BasePermitDto <T extends BasePermit> {
    private String workScope;
    private String system;
    private String equipment;
    private String requestor;
    private String controlAuthority;
    private PermitType type;
    private Long docNum;
    private Status status;
    private List<BaseTicket> tickets;
    private String createdBy;

    public abstract T toEntity();
//    {
//        return new BasePermit(this.workScope,this.system,this.equipment,this.requestor, this.controlAuthority, this.type, this.docNum, this.status, this.tickets);
//    }

}
