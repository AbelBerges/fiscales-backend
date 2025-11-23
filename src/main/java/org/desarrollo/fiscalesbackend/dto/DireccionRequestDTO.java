package org.desarrollo.fiscalesbackend.dto;

import org.desarrollo.fiscalesbackend.model.Calle;
import org.desarrollo.fiscalesbackend.model.TipoDepartamento;
import org.desarrollo.fiscalesbackend.model.TipoPiso;

public record DireccionRequestDTO(
        Integer idCalle,
        Integer altura,
        Integer idTipoPiso,
        Integer idTipoDepartamento
) {
}
