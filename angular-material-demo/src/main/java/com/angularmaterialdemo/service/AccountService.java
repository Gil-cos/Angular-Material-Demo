package com.angularmaterialdemo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.angularmaterialdemo.model.Account;

@Component
public interface AccountService {

	Account findById(Long id);
	
	Account createOrUpdate(Account account);
	
	void delete(Long id);
	
	List<Account> findByOwnerId(Long ownerId);
	
	List<Account> findAll();
	
}
