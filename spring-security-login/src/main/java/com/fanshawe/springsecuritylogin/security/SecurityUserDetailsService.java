package com.fanshawe.springsecuritylogin.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fanshawe.springsecuritylogin.model.User;
import com.fanshawe.springsecuritylogin.repository.UserRepository;

@Service
public class SecurityUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepo;
	
	public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
		
		User user  = userRepo.findUserByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not present")); 
        return (UserDetails) user;
		
	}
	
	public void createUser(UserDetails user) {
		userRepo.save((User) user);
	}

}
