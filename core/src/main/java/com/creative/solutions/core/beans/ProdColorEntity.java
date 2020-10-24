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
@Table(name = "prod_color", schema = "public")
public class ProdColorEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = -7234231275884269244L;

    @Id
    @GeneratedValue
    @Column(name = "color_id")
    private long colorId;
    @Column(name = "color")
    private String color;
    @Column(name = "prod_id")
    private long prodId;
}
