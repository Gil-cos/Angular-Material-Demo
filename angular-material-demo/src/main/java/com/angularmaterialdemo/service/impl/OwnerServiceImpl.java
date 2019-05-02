package com.angularmaterialdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.angularmaterialdemo.model.Owner;
import com.angularmaterialdemo.repository.OwnerRepository;
import com.angularmaterialdemo.service.OwnerService;

@Component
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;
	
	@Override
	public Owner createOrUpdate(Owner owner) {
		return ownerRepository.save(owner);
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		ownerRepository.deleteById(id);		
	}

	@Override
	public List<Owner> findAll() {
		return ownerRepository.findAll();
	}

}
