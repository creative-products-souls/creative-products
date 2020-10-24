package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ProdGenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdGenderRepository extends JpaRepository<ProdGenderEntity, Long>{

    @Query("SELECT * FROM ProdGenderEntity p WHERE p.prodId = ?")
    List<ProdGenderEntity> findProdGenderByProdId(long prodId);
}
