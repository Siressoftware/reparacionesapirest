package com.sires.reparaciones.service.mapper;

import com.sires.reparaciones.domain.Equipo;
import com.sires.reparaciones.service.dto.EquipoDTO;
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
public class EquipoDTOMapperImpl implements EquipoDTOMapper {

    @Override
    public EquipoDTO toEquipoDTO(Equipo equipo) {
        if ( equipo == null ) {
            return null;
        }

        EquipoDTO equipoDTO = new EquipoDTO();

        equipoDTO.setId( equipo.getId() );
        equipoDTO.setMarca( equipo.getMarca() );
        equipoDTO.setTipoequipo( equipo.getTipoequipo() );
        equipoDTO.setModelo( equipo.getModelo() );

        return equipoDTO;
    }

    @Override
    public List<EquipoDTO> toListEquipoDTO(List<Equipo> lista) {
        if ( lista == null ) {
            return null;
        }

        List<EquipoDTO> list = new ArrayList<EquipoDTO>( lista.size() );
        for ( Equipo equipo : lista ) {
            list.add( toEquipoDTO( equipo ) );
        }

        return list;
    }

    @Override
    public Equipo toEquipo(EquipoDTO equipo) {
        if ( equipo == null ) {
            return null;
        }

        Equipo equipo1 = new Equipo();

        equipo1.setId( equipo.getId() );
        equipo1.setMarca( equipo.getMarca() );
        equipo1.setTipoequipo( equipo.getTipoequipo() );
        equipo1.setModelo( equipo.getModelo() );

        return equipo1;
    }
}
