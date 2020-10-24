package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_desc", schema = "public")
public class ProdDescEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = 8997339724036019454L;

    @Id
    @GeneratedValue
    @Column(name = "desc_id")
    private long descId;
    @Column(name = "prod_desc")
    private String prodDesc;
    @Column(name = "age_grp")
    private String ageGrp;
    @Column(name = "prod_id")
    private long prodId;
}
