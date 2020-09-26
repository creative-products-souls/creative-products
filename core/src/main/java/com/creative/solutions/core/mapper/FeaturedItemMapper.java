package com.creative.solutions.core.mapper;

import com.creative.solutions.core.beans.FeaturedItemEntity;
import com.creative.solutions.core.dto.FeaturedItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FeaturedItemMapper {

    FeaturedItemMapper INSTANCE = Mappers.getMapper(FeaturedItemMapper.class);

    FeaturedItemDto toFeaturedItemDto(FeaturedItemEntity productEntity);
    List<FeaturedItemDto> toFeaturedItemDtos(List<FeaturedItemEntity> products);
    FeaturedItemEntity toFeaturedItem(FeaturedItemDto featuredItemDto);
    List<FeaturedItemEntity> toFeaturedItemList(List<FeaturedItemDto> featuredItemDtos);
}
