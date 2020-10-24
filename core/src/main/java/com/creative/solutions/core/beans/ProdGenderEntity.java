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
@Table(name = "prod_gender", schema = "public")
public class ProdGenderEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = -4337751062409234868L;

    @Id
    @GeneratedValue
    @Column(name = "gender_id")
    private long genderId;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age_grp")
    private String ageGrp;
    @Column(name = "prod_id")
    private long prodId;
}
