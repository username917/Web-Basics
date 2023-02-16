package com.fanshawe.springsecuritylogin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fanshawe.springsecuritylogin.security.SecurityUserDetailsService;

@RestController
public class HelloController {
	
	@Autowired
	private SecurityUserDetailsService userDetailsManager; 
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login(HttpServletRequest request, HttpSession session) {
		session.setAttribute(
		         "error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION")
		      ); 
		      return "login"; 
	}

	private Object getErrorMessage(HttpServletRequest request, String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
