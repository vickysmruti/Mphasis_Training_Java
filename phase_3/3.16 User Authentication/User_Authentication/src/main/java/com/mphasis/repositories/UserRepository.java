package com.mphasis.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mphasis.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
}
