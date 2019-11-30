package org.curd.repository;

import org.springframework.data.repository.CrudRepository;

import org.curd.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {	
	
	public User findByUsernameAndPassword(String username, String password);
}
