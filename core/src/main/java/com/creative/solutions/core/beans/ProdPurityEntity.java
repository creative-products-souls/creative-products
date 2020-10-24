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
@Table(name = "prod_purity", schema = "public")
public class ProdPurityEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = 6723896978072614229L;

    @Id
    @GeneratedValue
    @Column(name = "purity_id")
    private long purityId;
    @Column(name = "purity")
    private String purity;
    @Column(name = "prod_id")
    private long prodId;
}
