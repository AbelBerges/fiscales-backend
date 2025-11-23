package org.desarrollo.fiscalesbackend.dto;

public record TipoFiscalResponseDTO(
        Integer idTipoFiscal,
        String nombre,
        Boolean activo
) {
}
