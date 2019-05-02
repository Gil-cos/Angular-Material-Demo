package com.angularmaterialdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.angularmaterialdemo.model.Account;
import com.angularmaterialdemo.repository.AccountRepository;
import com.angularmaterialdemo.service.AccountService;

@Component
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account findById(Long id) {
		return accountRepository.findById(id).get();
	}

	@Override
	public Account createOrUpdate(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public void delete(Long id) {
		accountRepository.deleteById(id);
	}

	@Override
	public List<Account> findByOwnerId(Long ownerId) {
		return accountRepository.findByOwnerId(ownerId);
	}

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

}
