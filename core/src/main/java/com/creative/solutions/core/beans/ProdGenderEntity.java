package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "prod_gender", schema = "public")
public class ProdGenderEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "gender_id")
    private long genderId;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age_grp")
    private String ageGrp;
}
