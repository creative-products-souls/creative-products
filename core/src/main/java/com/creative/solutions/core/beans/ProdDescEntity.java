package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_desc", schema = "public")
public class ProdDescEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "desc_id")
    private long descId;
    @Column(name = "prod_desc")
    private String prodDesc;
    @Column(name = "age_grp")
    private String ageGrp;

}
