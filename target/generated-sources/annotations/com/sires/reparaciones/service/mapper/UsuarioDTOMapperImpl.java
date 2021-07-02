package com.sires.reparaciones.service.mapper;

import com.sires.reparaciones.domain.Usuario;
import com.sires.reparaciones.service.dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-29T21:45:19-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class UsuarioDTOMapperImpl implements UsuarioDTOMapper {

    @Override
    public UsuarioDTO toUsuarioDTO(Usuario xUsuario) {
        if ( xUsuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId( xUsuario.getId() );
        usuarioDTO.setNombre( xUsuario.getNombre() );
        usuarioDTO.setActivado( xUsuario.isActivado() );
        usuarioDTO.setDescripcion( xUsuario.getDescripcion() );

        return usuarioDTO;
    }

    @Override
    public List<UsuarioDTO> toListUsuarioDTO(List<Usuario> xUsuarios) {
        if ( xUsuarios == null ) {
            return null;
        }

        List<UsuarioDTO> list = new ArrayList<UsuarioDTO>( xUsuarios.size() );
        for ( Usuario usuario : xUsuarios ) {
            list.add( toUsuarioDTO( usuario ) );
        }

        return list;
    }

    @Override
    public Usuario toUsuario(UsuarioDTO xUsuarioDTO) {
        if ( xUsuarioDTO == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( xUsuarioDTO.getId() );
        usuario.setNombre( xUsuarioDTO.getNombre() );
        usuario.setActivado( xUsuarioDTO.isActivado() );
        usuario.setDescripcion( xUsuarioDTO.getDescripcion() );

        return usuario;
    }
}
