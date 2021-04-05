package com.sachin.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sachin.userservice.domain.Permission;

public interface PermissionRepository extends MongoRepository<Permission, String>{

}
