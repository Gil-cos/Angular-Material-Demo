package com.angularmaterialdemo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularmaterialdemo.model.Account;
import com.angularmaterialdemo.service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping()
	public ResponseEntity<List<Account>> listAll() {

		List<Account> accounts = accountService.findAll();

		return ResponseEntity.ok(accounts);
	}

	@PostMapping()
	public ResponseEntity<Account> add(@RequestBody Account account) {

		account.setDateCreated(new Date());
		Account accountPersisted = accountService.createOrUpdate(account);

		return ResponseEntity.ok(accountPersisted);
	}

	@GetMapping(value = "{ownerId}")
	public ResponseEntity<List<Account>> findByOwnerId(@PathVariable Long ownerId) {
		
		List<Account> accounts = accountService.findByOwnerId(ownerId);
		
		return ResponseEntity.ok(accounts);
	}

}
