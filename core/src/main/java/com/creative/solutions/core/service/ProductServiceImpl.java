package com.creative.solutions.core.service;

import com.creative.solutions.core.beans.ProductEntity;
import com.creative.solutions.core.beans.ProdColorEntity;
import com.creative.solutions.core.beans.ProdSizeEntity;
import com.creative.solutions.core.beans.ProdPurityEntity;
import com.creative.solutions.core.beans.ProdImageEntity;
import com.creative.solutions.core.beans.ProdGenderEntity;
import com.creative.solutions.core.beans.ProdWeightEntity;
import com.creative.solutions.core.beans.ProdPackagingEntity;
import com.creative.solutions.core.beans.ProdIngradientEntity;
import com.creative.solutions.core.beans.ProdFragnanceEntity;
import com.creative.solutions.core.dto.ProductDto;
import com.creative.solutions.core.mapper.ProductMapper;
import com.creative.solutions.core.repository.ProductRepository;
import com.creative.solutions.core.repository.ProdColorRepository;
import com.creative.solutions.core.repository.ProdFragranceRepository;
import com.creative.solutions.core.repository.ProdGenderRepository;
import com.creative.solutions.core.repository.ProdImageRepository;
import com.creative.solutions.core.repository.ProdIngradientRepository;
import com.creative.solutions.core.repository.ProdPackagingRepository;
import com.creative.solutions.core.repository.ProdPurityRepository;
import com.creative.solutions.core.repository.ProdSizeRepository;
import com.creative.solutions.core.repository.ProdWeightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProdColorRepository colorRepository;
    @Autowired
    ProdFragranceRepository fragranceRepository;
    @Autowired
    ProdGenderRepository genderRepository;
    @Autowired
    ProdImageRepository imageRepository;
    @Autowired
    ProdIngradientRepository ingradientRepository;
    @Autowired
    ProdPackagingRepository packagingRepository;
    @Autowired
    ProdPurityRepository purityRepository;
    @Autowired
    ProdSizeRepository sizeRepository;
    @Autowired
    ProdWeightRepository weightRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public ProductDto createProduct(ProductDto productDto) {

        ProductEntity entity = productMapper.toProduct(productDto);

        enrichProductAttributes(entity, productDto);

        entity = productRepository.save(entity);
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

    private void enrichProductAttributes(ProductEntity entity, ProductDto productDto) {
        //Set Product Color
        List<ProdColorEntity> prodColors = colorRepository.findProdColorsByProdId(productDto.getProdId());
        entity.setProdColor(!prodColors.isEmpty() ? prodColors.get(0) : null);

        //Set Product Fragrance
        List<ProdFragnanceEntity> prodFragrance = fragranceRepository.findProdFragranceByProdId(productDto.getProdId());
        entity.setProdFragrance(!prodFragrance.isEmpty() ? prodFragrance.get(0) : null);

        //Set Product Gender
        List<ProdGenderEntity> prodGender = genderRepository.findProdGenderByProdId(productDto.getProdId());
        entity.setProdGender(!prodGender.isEmpty() ? prodGender.get(0) : null);

        //Set Product Image
        List<ProdImageEntity> prodImage = imageRepository.findProdImageByProdId(productDto.getProdId());
        entity.setProdImage(!prodImage.isEmpty() ? prodImage.get(0) : null);

        //Set Product Ingradient
        List<ProdIngradientEntity> prodIngradient = ingradientRepository.findProdIngradientByProdId(productDto.getProdId());
        entity.setProdIngredient(!prodIngradient.isEmpty() ? prodIngradient.get(0) : null);

        //Set Product Packaging
        List<ProdPackagingEntity> prodPackaging = packagingRepository.findProdPackagingByProdId(productDto.getProdId());
        entity.setProdPackaging(!prodPackaging.isEmpty() ? prodPackaging.get(0) : null);

        //Set Product Purity
        List<ProdPurityEntity> prodPurity = purityRepository.findProdPurityByProdId(productDto.getProdId());
        entity.setProdPurity(!prodPurity.isEmpty() ? prodPurity.get(0) : null);

        //Set Product Size
        List<ProdSizeEntity> prodSize = sizeRepository.findProdSizeByProdId(productDto.getProdId());
        entity.setProdSize(!prodSize.isEmpty() ? prodSize.get(0) : null);

        //Set Product Weight
        List<ProdWeightEntity> prodWeight = weightRepository.findProdWeightByProdId(productDto.getProdId());
        entity.setProdWeight(!prodWeight.isEmpty() ? prodWeight.get(0) : null);
    }
}
