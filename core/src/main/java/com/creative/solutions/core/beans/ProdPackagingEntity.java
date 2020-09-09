package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_packaging", schema = "public")
public class ProdPackagingEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "packaging_id")
    private long packagingId;
    @Column(name = "package_type")
    private String packageType;
    @Column(name = "package_size")
    private String packageSize;
    @Column(name = "package_material")
    private String packageMaterial;
}
