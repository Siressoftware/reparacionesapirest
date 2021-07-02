package com.sires.reparaciones.service;

import com.sires.reparaciones.service.dto.ClienteDTO;

import java.util.List;
import java.util.Optional;

public interface ClienteService
{
   public boolean save(ClienteDTO cliente);
   public boolean delete(ClienteDTO cliente);
   public boolean delete(Long id);
   public boolean update(ClienteDTO cliente);
   public List<ClienteDTO> getAll();
   public List<ClienteDTO> getListarClientes(String filtro);
   public Optional<ClienteDTO> getObtenerCliente(long id);
   

}
