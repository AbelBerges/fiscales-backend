package org.desarrollo.fiscalesbackend.dto;

public record TipoEstablecimientoResponseDTO(
        Integer idTipoEstablecimiento,
        String tipo,
        Boolean activo
) {
}
