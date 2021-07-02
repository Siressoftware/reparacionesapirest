package com.sires.reparaciones.service.impl;


import com.sires.reparaciones.domain.Usuario;
import com.sires.reparaciones.repository.UsuarioRepository;
import com.sires.reparaciones.service.UsuarioService;
import com.sires.reparaciones.service.dto.UsuarioDTO;
import com.sires.reparaciones.service.mapper.UsuarioDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService
{
    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private UsuarioDTOMapper mapper;


    @Override
    public void save(UsuarioDTO xUsuario) {
          Usuario vUsuario= mapper.toUsuario(xUsuario);
          repository.save(vUsuario);
    }

    @Override
    public List<UsuarioDTO> findall() {
       List<Usuario> vUsuarios =  repository.findAll();
       return mapper.toListUsuarioDTO(vUsuarios);
    }

    @Override
    public Optional<UsuarioDTO> buscarPorId(Integer xId) {
        Optional<Usuario> vUsuario = repository.findById(xId);
        return Optional.of(mapper.toUsuarioDTO(vUsuario.get()));
    }

    @Override
    public List<UsuarioDTO> buscarActivos()
    {
       return null;
    }


}
