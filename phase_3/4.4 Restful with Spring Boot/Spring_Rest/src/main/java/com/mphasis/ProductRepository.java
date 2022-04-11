package com.mphasis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mphasis.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}

