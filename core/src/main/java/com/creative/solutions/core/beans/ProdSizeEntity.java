package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_size", schema = "public")
public class ProdSizeEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "size_id")
    private long sizeId;
    @Column(name = "size")
    private String size;

}
