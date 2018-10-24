package com.t.f.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.t.f.login.entity.Privilege;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<Privilege, Long> {

}
