package com.sires.reparaciones.security.filter;

import com.sires.reparaciones.security.JWTUtil;
import com.sires.reparaciones.service.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilterRequest extends OncePerRequestFilter
{
    @Autowired
    private JWTUtil jwtutil;
    @Autowired
    private UserSecurityService service;
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {
         String authorizationHeader = httpServletRequest.getHeader("token");
         if(authorizationHeader!=null && authorizationHeader.startsWith("Bearer"))
         {
             String jwt = authorizationHeader.substring(7);
             String username = jwtutil.extractUsername(jwt);
             if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null)
             {
                 UserDetails userDetails = service.loadUserByUsername(username);
                 if(jwtutil.validarToken(jwt,userDetails))
                 {
                     UsernamePasswordAuthenticationToken authtoken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                     authtoken.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
                     SecurityContextHolder.getContext().setAuthentication(authtoken);
                 }
             }
         }
         filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
