package com.sires.reparaciones.service.mapper;

import com.sires.reparaciones.domain.Equipo;
import com.sires.reparaciones.service.dto.EquipoDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipoDTOMapper
{
    @Mappings(
            {
                    @Mapping(source="id",target="id"),
                    @Mapping(source="marca",target="marca"),
                    @Mapping(source="tipoequipo",target="tipoequipo"),
                    @Mapping(source="modelo",target="modelo")
            }
    )
    public EquipoDTO toEquipoDTO(Equipo equipo);
    public List<EquipoDTO> toListEquipoDTO(List<Equipo> lista);

    @InheritInverseConfiguration
    @Mappings(
            {
                    @Mapping(target="cliente",ignore = true),
                    @Mapping(target="fechaingreso",ignore=true)
            }
    )
    public Equipo toEquipo(EquipoDTO equipo);
}
