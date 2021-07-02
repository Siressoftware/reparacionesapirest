package com.sires.reparaciones.service.impl;

import com.sires.reparaciones.domain.Cliente;
import com.sires.reparaciones.repository.ClienteRepository;
import com.sires.reparaciones.service.ClienteService;
import com.sires.reparaciones.service.dto.ClienteDTO;
import com.sires.reparaciones.service.mapper.ClienteDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository repository;
    @Autowired
    ClienteDTOMapper mapper;

    @Override
    public boolean save(ClienteDTO cliente)
    {
         try
         {
             repository.save(mapper.toCliente(cliente));
             return true;
         }
         catch(JpaSystemException ex)
         {
             return false;
         }

    }

    @Override
    public boolean delete(ClienteDTO cliente)
    {
        try
        {
            repository.delete(mapper.toCliente(cliente));
            return true;
        }
        catch(JpaSystemException ex)
        {
            return false;
        }

    }

    @Override
    public boolean delete(Long id)
    {
       try
       {
           Optional<ClienteDTO> cliente = this.getObtenerCliente(id);
           if(cliente.isPresent())
               repository.delete(mapper.toCliente(cliente.get()));
           return true;
       }
       catch(JpaSystemException ex)
       {
           System.out.println(ex.toString());
           return false;
       }

    }

    @Override
    public boolean update(ClienteDTO cliente)
    {
        try
        {
            if(cliente!=null)
                repository.save(mapper.toCliente(cliente));
            return true;
        }
        catch(JpaSystemException ex)
        {
            return false;
        }

    }

    @Override
    public List<ClienteDTO> getAll() {
        return mapper.toListClienteDTO(repository.findAll());
    }

    @Override
    public List<ClienteDTO> getListarClientes(String filtro) {
        return mapper.toListClienteDTO(repository.getClientesPor(filtro.toUpperCase()));
    }

    @Override
    public Optional<ClienteDTO> getObtenerCliente(long id) {
        return Optional.of(mapper.toClienteDTO(repository.getById(id)));
    }
}
