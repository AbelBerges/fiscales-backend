package org.desarrollo.fiscalesbackend.dto;

import org.desarrollo.fiscalesbackend.model.Direccion;
import org.desarrollo.fiscalesbackend.model.Establecimiento;
import org.desarrollo.fiscalesbackend.model.TipoFiscal;

public record FiscalResponseDTO(
        Integer idFiscal,
        String nombreFiscal,
        String apellidoFiscal,
        Integer edadFiscal,
        String correoFiscal,
        String telefono,
        Integer idTipoFiscal,
        Boolean activo,
        Integer idEstablecimientoVotacion,
        Integer idCalle,
        Integer altura,
        Integer idTipoPiso,
        Integer idTipoDepartamento,
        Integer idJornada,
        Integer idMesa
) {
}
