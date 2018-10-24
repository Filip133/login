package com.t.f.login.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface IUserDetailsService {

	UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;

}
