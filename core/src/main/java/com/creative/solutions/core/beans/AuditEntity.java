package com.creative.solutions.core.beans;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Date;

@Data
@MappedSuperclass
public class AuditEntity implements Serializable {

    private static final long serialVersionUID = -8467838854415340543L;

    @Column(name = "createdby")
    public String createdby;
    @Column(name = "createdon")
    @CreationTimestamp
    public Date createdon;
    @Column(name = "updatedby")
    public String updatedby;
    @Column(name = "updatedon")
    @UpdateTimestamp
    public Date updatedon;
}
