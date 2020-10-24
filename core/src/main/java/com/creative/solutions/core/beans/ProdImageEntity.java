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
@Table(name = "prod_image", schema = "public")
public class ProdImageEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = -3101070792007907815L;

    @Id
    @GeneratedValue
    @Column(name = "image_id")
    private long imageId;
    @Column(name = "image")
    private byte[] image;
    @Column(name = "clarity")
    private String clarity;
    @Column(name = "prod_id")
    private long prodId;
}
