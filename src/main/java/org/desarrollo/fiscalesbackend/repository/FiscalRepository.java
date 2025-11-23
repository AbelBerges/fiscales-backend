package org.desarrollo.fiscalesbackend.repository;

import org.desarrollo.fiscalesbackend.model.Fiscal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FiscalRepository extends JpaRepository<Fiscal, Integer> {

    List<Fiscal> findByApellidoFiscalContainingIgnoreCase(String apellido);
    boolean existsByMesa_IdMesa(Integer idMesa);
    List<Fiscal> findByMesa_IdMesa(Integer idMesa);
    List<Fiscal> findByTipoFiscal_IdTipoFiscal(Integer idTipofiscal);
    List<Fiscal> findByEstablecimientoAsignado_IdEstablecimiento(Integer id);
    List<Fiscal> findByEstablecimientoAsignado_IdEstablecimientoIsNull();
    List<Fiscal> findByTipoFiscal_IdTipoFiscalAndEstablecimientoAsignado_IdEstablecimientoIsNull(Integer tipoFiscal);
    List<Fiscal> findByTipoFiscal_IdTipoFiscalAndEstablecimientoAsignado_IdEstablecimiento(Integer iDtipoFiscal, Integer IdEstableciminetoAsignado);
    List<Fiscal> findByTipoFiscal_IdTipoFiscalAndMesa_IdMesaIsNull(Integer iDTipoFiscal);
    List<Fiscal> findByTipoFiscal_IdTipoFiscalAndJornada_IdJornadaAndMesa_IdMesaIsNull(Integer idTipoFiscal, Integer idJornada);
    Optional<Fiscal> findByTipoFiscal_IdTipoFiscalAndJornada_IdJornadaAndMesa_IdMesa(Integer idTipoFiscal, Integer IdJornada, Integer idMesa);
}
