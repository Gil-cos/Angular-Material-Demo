package com.angularmaterialdemo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.angularmaterialdemo.model.Owner;

@Component
public interface OwnerService {
	
	Owner createOrUpdate(Owner owner);
	
	Owner findById(Long id);
	
	void delete(Long id);
	
	List<Owner> findAll();

}
