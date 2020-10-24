package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProdColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdColorRepository extends JpaRepository<ProdColorEntity, Long>{

    @Query("SELECT * FROM ProdColorEntity p WHERE p.prodId = ?")
    List<ProdColorEntity> findProdColorsByProdId(long prodId);

}
