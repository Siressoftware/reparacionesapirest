package com.sires.reparaciones.repository;

import com.sires.reparaciones.domain.Reparacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReparacionRepository extends JpaRepository<Reparacion,Long> {
}
