package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_fragnance", schema = "public")
public class ProdFragnanceEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "fragnance_id")
    private long fragnanceId;
    @Column(name = "fragnance")
    private String fragnance;

}
