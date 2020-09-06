package com.creative.solutions.core.mapper;

import com.creative.solutions.core.beans.ProductEntity;
import com.creative.solutions.core.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto toProductDto(ProductEntity productEntity);
    List<ProductDto> toProductDtos(List<ProductEntity> products);
    ProductEntity toProduct(ProductDto productDTO);
    List<ProductEntity> toProductList(List<ProductDto> productDtos);
}
