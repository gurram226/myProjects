package com.spring_security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_security.model.users;

@Repository
public interface userRepo extends JpaRepository<users, Integer> {

	users findByUsername(String username);
}
