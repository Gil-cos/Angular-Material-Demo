package com.angularmaterialdemo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularmaterialdemo.model.Owner;
import com.angularmaterialdemo.service.OwnerService;

@RestController
@RequestMapping("/api/owner")
public class OwnerController {

	@Autowired
	private OwnerService ownerService;

	@GetMapping()
	public ResponseEntity<List<Owner>> listAll() {
		List<Owner> owners = ownerService.findAll();

		return ResponseEntity.ok(owners);
	}

	@PostMapping()
	public ResponseEntity<Owner> add(@RequestBody Owner owner) {

		owner.setDateOfBirth(new Date());
		Owner ownerPersisted = ownerService.createOrUpdate(owner);

		return ResponseEntity.ok(ownerPersisted);
	}
}
