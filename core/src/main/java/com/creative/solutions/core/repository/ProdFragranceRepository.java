package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProdFragnanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdFragranceRepository extends JpaRepository<ProdFragnanceEntity, Long>{

    @Query("SELECT * FROM ProdFragnanceEntity p WHERE p.prodId = ?")
    List<ProdFragnanceEntity> findProdFragranceByProdId(long prodId);
}
