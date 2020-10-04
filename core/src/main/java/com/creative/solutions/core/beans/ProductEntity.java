package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "product", schema = "public")
public class ProductEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "prod_id")
    private long prodId;
    @Column(name = "app_id")
    private long appId;
    @Column(name = "prod_code")
    private String prodCode;
    @Column(name = "prod_name")
    private String prodName;
    @Column(name = "prod_type")
    private String prodType;
    @Column(name = "isactive")
    private boolean isActive;

    @Column(name = "prod_image_path")
    private String prodImagePath;
    @Column(name = "prod_desc")
    private String prodDesc;
}
