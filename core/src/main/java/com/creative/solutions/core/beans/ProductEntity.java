package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

@Data
@Entity
@Table(name = "product", schema = "public")
public class ProductEntity extends AuditEntity implements Serializable {

    private static final long serialVersionUID = -4513169730200183387L;

    @Id
    @GeneratedValue
    @Column(name = "prod_id")
    private long prodId;
    @Column(name = "app_id")
    private long appId;
    @Column(name = "prod_code")
    private String prodCode;
    @Column(name = "prod_name")
    private String prodName;
    @Column(name = "prod_type")
    private String prodType;
    @Column(name = "isactive")
    private boolean isActive;

    @Column(name = "prod_image_path")
    private String prodImagePath;
    @Column(name = "prod_desc")
    private String prodDesc;
    @Column(name = "prod_category")
    private String prodCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "color_id")
    private ProdColorEntity prodColor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fragnance_id")
    private ProdFragnanceEntity prodFragrance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_id")
    private ProdGenderEntity prodGender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_id")
    private ProdImageEntity prodImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ingradient_id")
    private ProdIngradientEntity prodIngredient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "packaging_id")
    private ProdPackagingEntity prodPackaging;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purity_id")
    private ProdPurityEntity prodPurity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "size_id")
    private ProdSizeEntity prodSize;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "weight_id")
    private ProdWeightEntity prodWeight;
}
