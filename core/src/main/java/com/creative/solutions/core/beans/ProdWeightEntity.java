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
@Table(name = "prod_weight", schema = "public")
public class ProdWeightEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = -894738301268746476L;

    @Id
    @GeneratedValue
    @Column(name = "weight_id")
    private long weightId;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "unit")
    private String unit;
    @Column(name = "prod_id")
    private long prodId;
}
