package com.curd.repository;

	import com.curd.entity.LoginEntity;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository
	public interface LoginRepository extends JpaRepository<LoginEntity, Long> {

		LoginEntity findByPhoneNo(String phoneNo);
		
	}
