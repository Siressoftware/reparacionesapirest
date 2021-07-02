package com.sires.reparaciones.service;

import com.sires.reparaciones.domain.Usuario;
import com.sires.reparaciones.repository.UsuarioRepository;
import com.sires.reparaciones.service.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserSecurityService implements UserDetailsService
{
    @Autowired
    private UsuarioRepository repository;


    private Usuario buscarPorNombre(String nombre)
    {
        return repository.findUsuarioPorNombreActivado(nombre);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException
    {
        Usuario usuario =buscarPorNombre(s);
        if(usuario!=null)
             return new User(usuario.getNombre(),"{noop}" + usuario.getContrasena(),new ArrayList<>());
        else return null;
    }


}
