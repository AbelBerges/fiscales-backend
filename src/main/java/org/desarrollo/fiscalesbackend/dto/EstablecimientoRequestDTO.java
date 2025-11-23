package org.desarrollo.fiscalesbackend.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record EstablecimientoRequestDTO(
        @JsonAlias({"nombre", "nombre_establecimiento"})
        String nombre,
        String descripcion,
        Integer idCalle,
        Integer altura,
        Integer idTipoPiso,
        Integer idTipoDepartamento,
        Integer idTipoEstablecimiento,
        Boolean activo
) {
}
