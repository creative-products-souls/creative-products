package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProdWeightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdWeightRepository extends JpaRepository<ProdWeightEntity, Long>{

    @Query("SELECT * FROM ProdWeightEntity p WHERE p.prodId = ?")
    List<ProdWeightEntity> findProdWeightByProdId(long prodId);
}
