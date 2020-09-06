package com.creative.solutions.core.service;

import com.creative.solutions.core.repository.ProductAttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductAttributeServiceImpl implements ProductAttributeService{

    @Autowired
    ProductAttributeRepository productAttributeRepository;
}
