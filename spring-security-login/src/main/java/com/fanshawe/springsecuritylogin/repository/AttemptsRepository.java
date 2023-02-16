package com.fanshawe.springsecuritylogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fanshawe.springsecuritylogin.model.Attempts;

public interface AttemptsRepository extends JpaRepository<Attempts, Integer> {
	
	Optional<Attempts> findAttemptsByUsername(String username); 

}
