package com.sires.reparaciones.service.impl;

import com.sires.reparaciones.domain.Cliente;
import com.sires.reparaciones.domain.Equipo;
import com.sires.reparaciones.repository.ClienteRepository;
import com.sires.reparaciones.repository.EquipoRepository;
import com.sires.reparaciones.service.EquipoService;
import com.sires.reparaciones.service.dto.EquipoDTO;
import com.sires.reparaciones.service.mapper.EquipoDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServiceImpl implements EquipoService
{
    @Autowired
    private EquipoRepository repositoryequipo;
    @Autowired
    private ClienteRepository repositorycliente;
    @Autowired
    private EquipoDTOMapper mapper;

    @Override
    public boolean save(EquipoDTO equipo,Long idcliente)
    {
         boolean resultado=false;
         try
         {
             repositoryequipo.save(armarEquipo(equipo, idcliente));
             resultado=true;
         }
         catch(Exception ex)
         {
             System.out.println(ex.toString());
         }
         return resultado;
    }

    @Override
    public List<EquipoDTO> findEquiposDeCliente(long xIdCliente) {
        return mapper.toListEquipoDTO(repositoryequipo.equiposDeCliente(xIdCliente));
    }

    @Override
    public boolean delete(EquipoDTO equipo,long idcliente) {
        return false;
    }

    private Equipo armarEquipo(EquipoDTO equipo,long idcliente)
    {
         Equipo resultado = mapper.toEquipo(equipo);
         resultado.setCliente(repositorycliente.getById(idcliente));
         return resultado;
    }

    public List<String> obtenerTodasLasMarcas()
    {
        return repositoryequipo.findAllMarcasCargadas();
    }

    public List<String> obtenerMarcas(String tipoequipo)
    {
        return repositoryequipo.findAllMarcasCargadas(tipoequipo);
    }

    public List<String> obtenerTodosLosTiposEquipos()
    {
        return repositoryequipo.findAllTipoEquiposCargados();
    }

    public List<String> obtenerTodosLosModelos()
    {
        return repositoryequipo.findAllModelosCargados();
    }

    public List<String> obtenerTodosLosModelosCargados(String tipoequipo,String marca)
    {
        return repositoryequipo.findAllModelosCargados(tipoequipo,marca);
    }
}
