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
@Table(name = "featured_items", schema = "public")
public class FeaturedItemEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = -1296841391781780606L;

    @Id
    @GeneratedValue
    @Column(name = "feature_id")
    private long featureId;
    @Column(name = "feature_name")
    private String featureListName;
    @Column(name = "app_id")
    private long appId;
    @Column(name = "product_id")
    private long productId;
    @Column(name = "is_active")
    private boolean isActive;
}
