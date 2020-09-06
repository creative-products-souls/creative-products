package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProductDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetailsEntity, Long>{

}
