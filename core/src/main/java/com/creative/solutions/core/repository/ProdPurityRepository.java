package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProdPurityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdPurityRepository extends JpaRepository<ProdPurityEntity, Long>{

    @Query("SELECT * FROM ProdPurityEntity p WHERE p.prodId = ?")
    List<ProdPurityEntity> findProdPurityByProdId(long prodId);
}
