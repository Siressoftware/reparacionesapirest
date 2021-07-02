package com.sires.reparaciones.service.mapper;


import com.sires.reparaciones.domain.Usuario;
import com.sires.reparaciones.service.dto.UsuarioDTO;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel="spring")
public interface UsuarioDTOMapper
{
    @Mappings(
            {
                    @Mapping(source="id",target="id"),
                    @Mapping(source="nombre",target="nombre"),
                    @Mapping(source="activado",target="activado"),
                    @Mapping(source="descripcion",target="descripcion")
            }
    )
    UsuarioDTO toUsuarioDTO(Usuario xUsuario);
    List<UsuarioDTO> toListUsuarioDTO(List<Usuario> xUsuarios);

    @InheritInverseConfiguration
    @Mappings(
            {
                    @Mapping(target="contrasena",ignore = true),
                    @Mapping(target="token",ignore = true),
                    @Mapping(target="tokenVencimiento",ignore=true)
            }
    )

    Usuario toUsuario(UsuarioDTO xUsuarioDTO);

}
