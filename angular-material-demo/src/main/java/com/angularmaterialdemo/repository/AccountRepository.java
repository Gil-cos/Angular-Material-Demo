package com.angularmaterialdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularmaterialdemo.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByOwnerId(Long ownerId);
	
}
