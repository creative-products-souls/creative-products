package com.creative.solutions.core.service;

import com.creative.solutions.core.beans.ProductDetailsEntity;
import com.creative.solutions.core.dto.ProductDetailsDto;
import com.creative.solutions.core.mapper.ProductDetailsMapper;
import com.creative.solutions.core.repository.ProductDetailsRepository;
import com.creative.solutions.core.util.SequenceIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService{

    @Autowired
    ProductDetailsRepository productDetailsRepository;

    @Autowired
    ProductDetailsMapper productDetailsMapper;

    @Override
    public ProductDetailsDto createProductDetails(ProductDetailsDto productDetailsDto) {

        if(productDetailsDto.getPrdtlId() == 0){
            productDetailsDto.setPrdtlId(SequenceIdGenerator.getSequenceId());
        }

        ProductDetailsEntity entity = productDetailsMapper.toProductDetails(productDetailsDto);
        entity = productDetailsRepository.save(entity);
        return productDetailsMapper.toProductDetailsDto(entity);
    }

    @Override
    public ProductDetailsDto getProductDetailsById(Long productDtlId) {
        Optional<ProductDetailsEntity> entity = productDetailsRepository.findById(productDtlId);
        return productDetailsMapper.toProductDetailsDto(entity.get());
    }

    @Override
    public List<ProductDetailsDto> getProductDetailsList() {
        return productDetailsMapper.toProductDetailsDtos(productDetailsRepository.findAll());
    }

    @Override
    public void deleteProductDetails(Long productDtlId) {
        productDetailsRepository.deleteById(productDtlId);
    }
}
