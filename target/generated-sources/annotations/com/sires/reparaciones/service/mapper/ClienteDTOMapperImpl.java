package com.sires.reparaciones.service.mapper;

import com.sires.reparaciones.domain.Cliente;
import com.sires.reparaciones.service.dto.ClienteDTO;
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
public class ClienteDTOMapperImpl implements ClienteDTOMapper {

    @Override
    public ClienteDTO toClienteDTO(Cliente xCliente) {
        if ( xCliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setId( xCliente.getId() );
        clienteDTO.setNombre( xCliente.getNombre() );
        clienteDTO.setCalle( xCliente.getCalle() );
        clienteDTO.setNro( xCliente.getNro() );
        clienteDTO.setPiso( xCliente.getPiso() );
        clienteDTO.setDpto( xCliente.getDpto() );
        clienteDTO.setLocalidad( xCliente.getLocalidad() );
        clienteDTO.setProvincia( xCliente.getProvincia() );
        clienteDTO.setCp( xCliente.getCp() );
        clienteDTO.setTelefono( xCliente.getTelefono() );
        clienteDTO.setCelular( xCliente.getCelular() );
        clienteDTO.setMail( xCliente.getMail() );
        clienteDTO.setObservaciones( xCliente.getObservaciones() );
        clienteDTO.setCondicioniva( xCliente.getCondicionIVA() );
        clienteDTO.setCuit( xCliente.getCuit() );
        clienteDTO.setGeo( xCliente.getGeo() );

        return clienteDTO;
    }

    @Override
    public List<ClienteDTO> toListClienteDTO(List<Cliente> xCliente) {
        if ( xCliente == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>( xCliente.size() );
        for ( Cliente cliente : xCliente ) {
            list.add( toClienteDTO( cliente ) );
        }

        return list;
    }

    @Override
    public Cliente toCliente(ClienteDTO clienteDTO) {
        if ( clienteDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( clienteDTO.getId() );
        cliente.setNombre( clienteDTO.getNombre() );
        cliente.setCalle( clienteDTO.getCalle() );
        cliente.setNro( clienteDTO.getNro() );
        cliente.setPiso( clienteDTO.getPiso() );
        cliente.setDpto( clienteDTO.getDpto() );
        cliente.setLocalidad( clienteDTO.getLocalidad() );
        cliente.setProvincia( clienteDTO.getProvincia() );
        cliente.setCp( clienteDTO.getCp() );
        cliente.setTelefono( clienteDTO.getTelefono() );
        cliente.setCelular( clienteDTO.getCelular() );
        cliente.setMail( clienteDTO.getMail() );
        cliente.setObservaciones( clienteDTO.getObservaciones() );
        cliente.setCondicionIVA( clienteDTO.getCondicioniva() );
        cliente.setCuit( clienteDTO.getCuit() );
        cliente.setGeo( clienteDTO.getGeo() );

        return cliente;
    }
}
