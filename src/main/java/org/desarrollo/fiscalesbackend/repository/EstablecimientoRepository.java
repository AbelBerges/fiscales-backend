package org.desarrollo.fiscalesbackend.repository;

import org.desarrollo.fiscalesbackend.model.Establecimiento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstablecimientoRepository extends JpaRepository<Establecimiento, Integer> {
    List<Establecimiento> findByNombreEstablecimientoContainingIgnoreCase(String nombre);
    boolean existsByNombreEstablecimiento(String nombreEstablecimiento);
}
