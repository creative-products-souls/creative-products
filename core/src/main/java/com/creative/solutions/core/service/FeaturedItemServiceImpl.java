package com.creative.solutions.core.service;

import com.creative.solutions.core.beans.FeaturedItemEntity;
import com.creative.solutions.core.dto.FeaturedItemDto;
import com.creative.solutions.core.dto.ProductDto;
import com.creative.solutions.core.mapper.FeaturedItemMapper;
import com.creative.solutions.core.repository.FeaturedItemRepository;
import com.creative.solutions.core.util.SequenceIdGenerator;
import com.google.common.collect.Lists;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class FeaturedItemServiceImpl implements FeaturedItemService{

    @Autowired
    FeaturedItemRepository featuredItemRepository;

    @Autowired
    FeaturedItemMapper featuredItemMapper;

    @Autowired
    ProductService productService;

    @Override
    public List<ProductDto> createFeaturedList(FeaturedItemDto featuredItem) {
        List<ProductDto> prodDtoList = Lists.newArrayList();
        if(featuredItem != null && !CollectionUtils.isEmpty(featuredItem.getProductList())){
            Validate.notEmpty(featuredItem.getFeatureListName());
            List<FeaturedItemEntity> featuredItemEntities = featuredItemRepository.saveAll(featuredItemMapper.
                    toFeaturedItemList(mapProdDtoToFeaturedItems(featuredItem.getProductList(), featuredItem.getFeatureListName())));
            prodDtoList.addAll(mapFeaturedItemsToProdDtos(featuredItemMapper.toFeaturedItemDtos(featuredItemEntities)));
        }
        return prodDtoList;
    }

    private List<FeaturedItemDto> mapProdDtoToFeaturedItems(List<ProductDto> products, String listName) {
        List<FeaturedItemDto> featuredList = Lists.newArrayList();
        products.forEach(productDto -> {
            FeaturedItemDto featuredItemDto = new FeaturedItemDto();
            featuredItemDto.setFeatureId(SequenceIdGenerator.getSequenceId());
            featuredItemDto.setFeatureListName(listName);
            featuredItemDto.setAppId(productDto.getAppId());
            featuredItemDto.setProductId(productDto.getProdId());
            featuredList.add(featuredItemDto);
        });
        return featuredList;
    }

    private List<ProductDto> mapFeaturedItemsToProdDtos(List<FeaturedItemDto> featuredItems) {
        return featuredItems.stream().map(featuredItemDto ->
                productService.getProductById(featuredItemDto.getProductId())).filter(Objects::nonNull).collect(Collectors.toList());
    }
}
