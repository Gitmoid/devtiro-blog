package com.devtiro.blog.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface AuthenticationService {
    UserDetails authenticate(String email, String password); // returns UserDetails by authenticating user email and password

    String generateToken(UserDetails userDetails); // turns UserDetails into JWT

    UserDetails validateToken(String token); // turns JWT into UserDetails
}