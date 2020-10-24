package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProdIngradientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdIngradientRepository extends JpaRepository<ProdIngradientEntity, Long>{

    @Query("SELECT * FROM ProdIngradientEntity p WHERE p.prodId = ?")
    List<ProdIngradientEntity> findProdIngradientByProdId(long prodId);
}
