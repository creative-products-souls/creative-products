package com.creative.solutions.core.service;

import com.creative.solutions.core.beans.ProductEntity;
import com.creative.solutions.core.dto.ProductDto;
import com.creative.solutions.core.mapper.ProductMapper;
import com.creative.solutions.core.repository.ProductRepository;
import com.creative.solutions.core.util.SequenceIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public ProductDto createProduct(ProductDto productDto) {

        if(productDto.getProdId() == 0){
            productDto.setProdId(SequenceIdGenerator.getSequenceId());
        }

        ProductEntity entity = productRepository.save(productMapper.toProduct(productDto));
        return productMapper.toProductDto(entity);
    }

    @Override
    public ProductDto getProductById(Long productId) {
        Optional<ProductEntity> entity = productRepository.findById(productId);
        return productMapper.toProductDto(entity.get());
    }

    @Override
    public List<ProductDto> getProductList() {
        return productMapper.toProductDtos(productRepository.findAll());
    }

    @Override
    public void deleteProduct(Long productId) {
        Optional<ProductEntity> entity = productRepository.findById(productId);
        if(entity.isPresent()){
            entity.get().setActive(false);
            productRepository.save(entity.get());
        }
    }
}
