package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_weight", schema = "public", catalog = "postgres")
public class ProdWeightEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "weight_id")
    private long weightId;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "unit")
    private String unit;

}
