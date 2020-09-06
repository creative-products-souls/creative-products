package com.creative.solutions.core.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "product_details", schema = "public", catalog = "postgres")
public class ProductDetailsEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "prdtl_id")
    private long prdtlId;
    @Column(name = "app_id")
    private Long appId;
    @Column(name = "prod_id")
    private Long prodId;
    @Column(name = "color_id")
    private Long colorId;
    @Column(name = "fragnance_id")
    private Long fragnanceId;
    @Column(name = "size_id")
    private Long sizeId;
    @Column(name = "packaging_id")
    private Long packagingId;
    @Column(name = "ingradient_id")
    private Long ingradientId;
    @Column(name = "purity_id")
    private Long purityId;
    @Column(name = "gender_id")
    private Long genderId;
    @Column(name = "desc_id")
    private Long descId;

    /*@Column(name = "prod_image_path")
    private String prodImagePath;
    @Column(name = "prod_name")
    private String prodName;
    @Column(name = "prod_desc")
    private String prodDesc;*/
    /*@Column(name = "prod_name_align")
    private String prodNameAlign;
    @Column(name = "prod_review_align")
    private String prodReviewAlign;
    @Column(name = "prod_price_pos")
    private String prodPricePos;
    @Column(name = "prod_price_align")
    private String prodPriceAlign;*/
}
