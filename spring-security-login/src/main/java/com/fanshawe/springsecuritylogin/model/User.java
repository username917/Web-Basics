package com.fanshawe.springsecuritylogin.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// to import quickly, click Ctrl-Shift-O

@Entity
@Table(name = "users")
public class User implements UserDetails {
	
	@Id
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="account_non_locked")
	private boolean account_non_locked;
	
	private static final long serialVersionUID = 1L;
	
	public User() {
		
	}
	
	public Collection< extends GrantedAuthority> getAuthorities() { 
	      return List.of(() -> "read"); 
	   }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAccount_non_locked() {
		return account_non_locked;
	}

	public void setAccount_non_locked(boolean account_non_locked) {
		this.account_non_locked = account_non_locked;
	}

	public User(String username, String password, boolean account_non_locked) {
		super();
		this.username = username;
		this.password = password;
		this.account_non_locked = account_non_locked;
	}
	
	

}
