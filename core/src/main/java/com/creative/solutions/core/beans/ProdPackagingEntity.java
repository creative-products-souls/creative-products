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
@Table(name = "prod_packaging", schema = "public")
public class ProdPackagingEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = -3729378776379758650L;

    @Id
    @GeneratedValue
    @Column(name = "packaging_id")
    private long packagingId;
    @Column(name = "package_type")
    private String packageType;
    @Column(name = "package_size")
    private String packageSize;
    @Column(name = "package_material")
    private String packageMaterial;
    @Column(name = "prod_id")
    private long prodId;
}
