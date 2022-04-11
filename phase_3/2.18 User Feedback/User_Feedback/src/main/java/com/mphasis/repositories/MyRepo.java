package com.mphasis.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.entity.Feedback;

@Repository
public interface MyRepo extends CrudRepository<Feedback, Integer>{

}
