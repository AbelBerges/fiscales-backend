package org.desarrollo.fiscalesbackend.dto;

import java.util.List;

public record AsignacionMesasRequestDTO(
        Integer idEstablecimiento,
        List<Integer> numerosMesa
) {
}
