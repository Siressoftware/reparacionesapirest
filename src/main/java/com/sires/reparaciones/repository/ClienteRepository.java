package com.sires.reparaciones.repository;

import com.sires.reparaciones.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Long>
{
    @Query(value="select c from Cliente c where upper(c.nombre) like %:filtro%"
    +" or upper(c.calle) like %:filtro%"
    +" or upper(c.cuit) like %:filtro%"
    +" or upper(c.telefono) like %:filtro%"
    +" or upper(c.celular) like %:filtro%"
    + " order by c.nombre asc")
    public List<Cliente> getClientesPor(@Param("filtro") String xFiltro);
}
