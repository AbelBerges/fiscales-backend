package org.desarrollo.fiscalesbackend.dto;

public record TipoDepartamentoResponseDTO(
        Integer idDepartamento,
        String nombre,
        Boolean activo
) {
}
