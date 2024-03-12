package com.example.SpringSecurityJWT.repositories;

import com.example.SpringSecurityJWT.models.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<RoleEntity, Long> {
}
