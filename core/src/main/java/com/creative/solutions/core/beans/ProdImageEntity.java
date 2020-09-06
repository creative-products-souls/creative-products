package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_image", schema = "public", catalog = "postgres")
public class ProdImageEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "image_id")
    private long imageId;
    @Column(name = "image")
    private byte[] image;
    @Column(name = "clarity")
    private String clarity;

}
