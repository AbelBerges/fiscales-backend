package org.desarrollo.fiscalesbackend.repository;

import org.desarrollo.fiscalesbackend.model.TipoFiscal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoFiscalRepository extends JpaRepository<TipoFiscal, Integer> {

    TipoFiscal findByNombreContainingIgnoreCase(String nombre);
}
