package com.sires.reparaciones.service.mapper;

import com.sires.reparaciones.domain.Cliente;
import com.sires.reparaciones.service.dto.ClienteDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteDTOMapper
{
    @Mappings(
            {
                    @Mapping(source="id",target="id"),
                    @Mapping(source="nombre",target="nombre"),
                    @Mapping(source="calle",target="calle"),
                    @Mapping(source="nro",target="nro"),
                    @Mapping(source="piso",target="piso"),
                    @Mapping(source="dpto",target="dpto"),
                    @Mapping(source="localidad",target="localidad"),
                    @Mapping(source="provincia",target="provincia"),
                    @Mapping(source="cp",target="cp"),
                    @Mapping(source="telefono",target="telefono"),
                    @Mapping(source="celular",target="celular"),
                    @Mapping(source="mail",target="mail"),
                    @Mapping(source="observaciones",target="observaciones"),
                    @Mapping(source="condicionIVA",target="condicioniva"),
                    @Mapping(source="cuit",target="cuit"),
                    @Mapping(source="geo",target="geo")
            }
    )
    ClienteDTO toClienteDTO(Cliente xCliente);
    List<ClienteDTO> toListClienteDTO(List<Cliente> xCliente);
    @InheritInverseConfiguration
    Cliente toCliente(ClienteDTO clienteDTO);
}
