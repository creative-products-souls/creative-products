package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_ingradient", schema = "public", catalog = "postgres")
public class ProdIngradientEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "ingradient_id")
    private long ingradientId;
    @Column(name = "material")
    private String material;
}
