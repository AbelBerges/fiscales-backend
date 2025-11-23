package org.desarrollo.fiscalesbackend.dto;

import org.desarrollo.fiscalesbackend.model.Calle;
import org.desarrollo.fiscalesbackend.model.TipoDepartamento;
import org.desarrollo.fiscalesbackend.model.TipoPiso;

public record DireccionResponseDTO(
        Integer idDireccion,
        Integer calle,
        Integer altura,
        Integer tipoPiso,
        Integer tipoDepartamento
) {
}
