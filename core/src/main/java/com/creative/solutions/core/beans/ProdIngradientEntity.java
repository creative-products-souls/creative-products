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
@Table(name = "prod_ingradient", schema = "public")
public class ProdIngradientEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = 433495044975337143L;

    @Id
    @GeneratedValue
    @Column(name = "ingradient_id")
    private long ingradientId;
    @Column(name = "material")
    private String material;
    @Column(name = "prod_id")
    private long prodId;
}
