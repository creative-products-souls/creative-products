package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_color", schema = "public")
public class ProdColorEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "color_id")
    private long colorId;
    @Column(name = "color")
    private String color;

}
