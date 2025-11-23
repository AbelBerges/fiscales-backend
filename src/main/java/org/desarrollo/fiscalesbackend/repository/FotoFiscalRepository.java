package org.desarrollo.fiscalesbackend.repository;

import org.desarrollo.fiscalesbackend.model.Fiscal;
import org.desarrollo.fiscalesbackend.model.FotoFiscal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FotoFiscalRepository extends JpaRepository<FotoFiscal, Integer> {
    Optional<FotoFiscal> findByFiscalIdFiscal(Integer idFiscal);
}
