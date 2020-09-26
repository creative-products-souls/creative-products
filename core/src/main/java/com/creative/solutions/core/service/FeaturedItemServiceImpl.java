package com.creative.solutions.core.service;

import com.creative.solutions.core.beans.FeaturedItemEntity;
import com.creative.solutions.core.beans.ProductEntity;
import com.creative.solutions.core.dto.FeaturedItemDto;
import com.creative.solutions.core.dto.ProductDto;
import com.creative.solutions.core.mapper.FeaturedItemMapper;
import com.creative.solutions.core.mapper.ProductMapper;
import com.creative.solutions.core.repository.FeaturedItemRepository;
import com.creative.solutions.core.repository.ProductRepository;
import com.creative.solutions.core.util.SequenceIdGenerator;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Service
public class FeaturedItemServiceImpl implements FeaturedItemService{

    @Autowired
    FeaturedItemRepository featuredItemRepository;

    @Autowired
    FeaturedItemMapper featuredItemMapper;

    @Autowired
    ProductService productService;

    @Override
    public List<ProductDto> createFeaturedList(List<ProductDto> productDtos) {
        List<ProductDto> prodDtoList = Lists.newArrayList();
        if(!CollectionUtils.isEmpty(productDtos)){
            List<FeaturedItemEntity> featuredItemEntities =
                    featuredItemRepository.saveAll(featuredItemMapper.toFeaturedItemList(mapProdDtoToFeaturedItems(productDtos)));
            prodDtoList.addAll(mapFeaturedItemsToProdDtos(featuredItemMapper.toFeaturedItemDtos(featuredItemEntities)));
        }
        return prodDtoList;
    }

    private List<FeaturedItemDto> mapProdDtoToFeaturedItems(List<ProductDto> productDtos) {
        List<FeaturedItemDto> featuredList = Lists.newArrayList();
        for(ProductDto productDto : productDtos){
            FeaturedItemDto featuredItemDto = new FeaturedItemDto();
            featuredItemDto.setFeatureId(SequenceIdGenerator.getSequenceId());
            featuredItemDto.setFeatureListName(null);
            featuredItemDto.setAppId(0);
            featuredItemDto.setProductId(productDto.getProdId());
            featuredList.add(featuredItemDto);
        }
        return featuredList;
    }

    private List<ProductDto> mapFeaturedItemsToProdDtos(List<FeaturedItemDto> featuredItemDtos) {
        List<ProductDto> prodDtoList = Lists.newArrayList();
        for(FeaturedItemDto featuredItemDto : featuredItemDtos){
            ProductDto productDto = productService.getProductById(featuredItemDto.getProductId());
            if(productDto != null){
                prodDtoList.add(productDto);
            }
        }
        return prodDtoList;
    }
}
