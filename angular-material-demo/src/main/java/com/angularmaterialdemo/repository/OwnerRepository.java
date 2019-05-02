package com.angularmaterialdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularmaterialdemo.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
