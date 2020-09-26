package com.creative.solutions.core.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FeaturedItemDto extends BaseProductAtrributeDto implements Serializable {

    private long featureId;
    private String featureListName;
    private long appId;
    private long productId;
    private boolean isActive;
}
