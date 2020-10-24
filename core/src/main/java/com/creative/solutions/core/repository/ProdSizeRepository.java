package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProdSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdSizeRepository extends JpaRepository<ProdSizeEntity, Long>{

    @Query("SELECT * FROM ProdSizeEntity p WHERE p.prodId = ?")
    List<ProdSizeEntity> findProdSizeByProdId(long prodId);
}
