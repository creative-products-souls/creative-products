package com.creative.solutions.core.repository;

import com.creative.solutions.core.beans.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAttributeRepository extends JpaRepository<ApplicationEntity, Long>{

}
