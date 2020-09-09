package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "application", schema = "public")
public class ApplicationEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "app_id")
    private long appId;
    @Column(name = "app_name")
    private String appName;
    @Column(name = "app_type")
    private String appType;
    @Column(name = "isActive")
    private boolean isActive;

}
