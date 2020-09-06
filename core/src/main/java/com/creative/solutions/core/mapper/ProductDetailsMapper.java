package com.creative.solutions.core.mapper;

import com.creative.solutions.core.beans.ProductDetailsEntity;
import com.creative.solutions.core.dto.ProductDetailsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductDetailsMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDetailsDto toProductDetailsDto(ProductDetailsEntity productDetailsEntity);
    ProductDetailsEntity toProductDetails(ProductDetailsDto productDetailsDto);
    List<ProductDetailsDto> toProductDetailsDtos(List<ProductDetailsEntity> productDtl);
    List<ProductDetailsEntity> toProductDetailsList(List<ProductDetailsDto> productDtlDtos);
}
