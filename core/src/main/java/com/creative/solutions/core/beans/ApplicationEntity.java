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
@Table(name = "application", schema = "public")
public class ApplicationEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = 1583730620038230906L;

    @Id
    @GeneratedValue
    @Column(name = "app_id")
    private long appId;
    @Column(name = "app_name")
    private String appName;
    @Column(name = "app_type")
    private String appType;
    @Column(name = "isActive")
    private boolean isActive;

}
