package com.curd.repository;

import com.curd.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
    public User findByNameAndEmail(String name, String email);

	 
}