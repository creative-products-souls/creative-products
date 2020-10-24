package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProdPackagingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdPackagingRepository extends JpaRepository<ProdPackagingEntity, Long>{

    @Query("SELECT * FROM ProdPackagingEntity p WHERE p.prodId = ?")
    List<ProdPackagingEntity> findProdPackagingByProdId(long prodId);
}
