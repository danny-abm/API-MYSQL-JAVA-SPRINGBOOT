package com.bgeneral.training.api.repositories;

import com.bgeneral.training.api.models.person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends CrudRepository<person , Long> {
    
}
