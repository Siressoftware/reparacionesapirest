package com.sires.reparaciones.web.controller;

import com.sires.reparaciones.service.UserSecurityService;
import com.sires.reparaciones.service.dto.AuthenticationRequest;
import com.sires.reparaciones.service.dto.AuthentificationResponse;
import com.sires.reparaciones.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController
{
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserSecurityService service;
    @Autowired
    private JWTUtil utils;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthentificationResponse> createToken(@RequestBody AuthenticationRequest request)
    {
        try
        {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),request.getContrasena()));
            UserDetails users = service.loadUserByUsername(request.getUsername());
            String jwt = utils.generateToken(users);
            return new ResponseEntity<>(new AuthentificationResponse(jwt),HttpStatus.OK);
        }
       catch(BadCredentialsException ex)
       {
           return new ResponseEntity<>(HttpStatus.FORBIDDEN);

       }

    }
}
