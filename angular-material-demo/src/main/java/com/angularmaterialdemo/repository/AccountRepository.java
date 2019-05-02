package com.angularmaterialdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularmaterialdemo.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	List<Account> findByOwnerId(Long ownerId);
	
}
