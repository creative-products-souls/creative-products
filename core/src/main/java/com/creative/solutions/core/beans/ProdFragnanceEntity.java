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
@Table(name = "prod_fragnance", schema = "public")
public class ProdFragnanceEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = -6356785192856345530L;

    @Id
    @GeneratedValue
    @Column(name = "fragnance_id")
    private long fragnanceId;
    @Column(name = "fragnance")
    private String fragnance;
    @Column(name = "prod_id")
    private long prodId;
}
