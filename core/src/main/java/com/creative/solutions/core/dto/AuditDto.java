package com.creative.solutions.core.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class AuditDto extends BaseProductAtrributeDto implements Serializable {


    //LocalDate, LocalDatetime for dates
    public String createdby;
    public Date createdon;
    public String updatedby;
    public Date updatedon;
}
