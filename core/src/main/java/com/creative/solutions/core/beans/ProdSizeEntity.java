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
@Table(name = "prod_size", schema = "public")
public class ProdSizeEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = -8323631394832701875L;

    @Id
    @GeneratedValue
    @Column(name = "size_id")
    private long sizeId;
    @Column(name = "size")
    private String size;
    @Column(name = "prod_id")
    private long prodId;
}
