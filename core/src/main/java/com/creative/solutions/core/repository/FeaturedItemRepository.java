package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.FeaturedItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturedItemRepository extends JpaRepository<FeaturedItemEntity, Long>{

}
