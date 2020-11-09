package com.offcn.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetaikServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        List<GrantedAuthority> list =new ArrayList<>();
        list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        return new User(name,"",list) ;
    }
}

