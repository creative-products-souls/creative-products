package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProdImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdImageRepository extends JpaRepository<ProdImageEntity, Long>{

    @Query("SELECT * FROM ProdImageEntity p WHERE p.prodId = ?")
    List<ProdImageEntity> findProdImageByProdId(long prodId);
}
