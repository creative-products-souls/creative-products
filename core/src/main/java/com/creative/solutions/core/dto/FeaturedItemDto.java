package com.creative.solutions.core.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.google.common.collect.Lists;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FeaturedItemDto extends BaseProductAtrributeDto implements Serializable {

    private long featureId;
    private String featureListName;
    private long appId;
    private long productId;
    private boolean isActive;
    public List<ProductDto> productList = Lists.newArrayList();
}
