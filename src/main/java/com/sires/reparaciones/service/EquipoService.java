package com.sires.reparaciones.service;

import com.sires.reparaciones.service.dto.EquipoDTO;

import java.util.List;

public interface EquipoService
{
    public boolean save(EquipoDTO equipo,Long idcliente);
    public List<EquipoDTO> findEquiposDeCliente(long xIdCliente);
    public boolean delete(EquipoDTO equipo,long idcliente);
    public List<String> obtenerTodasLasMarcas();
    public List<String> obtenerMarcas(String tipoequipo);
    public List<String> obtenerTodosLosTiposEquipos();
    public List<String> obtenerTodosLosModelos();
    public List<String> obtenerTodosLosModelosCargados(String tipoequipo,String marca);
}
