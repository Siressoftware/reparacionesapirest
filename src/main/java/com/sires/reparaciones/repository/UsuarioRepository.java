package com.sires.reparaciones.repository;


import com.sires.reparaciones.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>
{
    public Usuario findByNombre(String xNombre);
    public List<Usuario> findByNombreAndActivado(String nombre,boolean estado);

    @Query("select us from Usuario us where nombre=:nombre and activado=true")
    public Usuario findUsuarioPorNombreActivado(@Param("nombre")String nombre);
}
