package com.sires.reparaciones.service;

import com.sires.reparaciones.domain.Usuario;
import com.sires.reparaciones.service.dto.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface UsuarioService
{
    void save(UsuarioDTO xUsuario);
    List<UsuarioDTO> findall();
    Optional<UsuarioDTO> buscarPorId(Integer xId);
    List<UsuarioDTO> buscarActivos();
}
