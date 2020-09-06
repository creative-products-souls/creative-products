package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_purity", schema = "public", catalog = "postgres")
public class ProdPurityEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "purity_id")
    private long purityId;
    @Column(name = "purity")
    private String purity;
}
