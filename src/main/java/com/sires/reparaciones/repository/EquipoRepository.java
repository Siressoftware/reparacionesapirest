package com.sires.reparaciones.repository;

import com.sires.reparaciones.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo,Long>
{
    @Query(value="select eq from Equipo eq"
    +             " left join fetch eq.cliente c where c.id=:cliente")
    public List<Equipo> equiposDeCliente(@Param("cliente") long idcliente);

    @Query(value="select distinct eq.marca from Equipo eq order by eq.marca asc")
    public List<String> findAllMarcasCargadas();
    @Query(value="select distinct eq.tipoequipo from Equipo eq order by eq.tipoequipo asc")
    public List<String> findAllTipoEquiposCargados();
    @Query(value="select distinct eq.modelo from Equipo eq order by eq.modelo asc")
    public List<String> findAllModelosCargados();
    @Query(value="select distinct eq.marca from Equipo eq"
            +" where uppercase(tipoequipo)=:tipoequipo order by eq.marca asc")
    public List<String> findAllMarcasCargadas(@Param("tipoequipo") String marca);
    @Query(value="select distinct eq.modelo from Equipo eq "
            +" where uppercase(eq.tipoequipo)=:tipoequipo and uppercase(eq.marca)=:marca"
            +" order by eq.modelo asc")
    public List<String> findAllModelosCargados(@Param("tipoequipo") String tipoequipo,
                                               @Param("marca") String marca);
}
