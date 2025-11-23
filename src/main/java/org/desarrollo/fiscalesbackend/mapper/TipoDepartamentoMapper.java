package org.desarrollo.fiscalesbackend.mapper;

import org.desarrollo.fiscalesbackend.dto.TipoDeparamentoRequestDTO;
import org.desarrollo.fiscalesbackend.dto.TipoDepartamentoResponseDTO;
import org.desarrollo.fiscalesbackend.model.TipoDepartamento;

public class TipoDepartamentoMapper {

    public static TipoDepartamento aEntidadDeCreacion(TipoDeparamentoRequestDTO dto) {
        TipoDepartamento td = new TipoDepartamento(dto.nombre(), dto.activo());
        return td;
    }

    public static TipoDepartamentoResponseDTO aEntidadResponseDTO(TipoDepartamento td) {
        return new TipoDepartamentoResponseDTO(td.getIdDepartamento(), td.getNombre(), td.isActivo());
    }

    public static void paraActualizarTipoDepartamento(TipoDeparamentoRequestDTO dto, TipoDepartamento td) {
        if (dto.nombre() != null) td.setNombre(dto.nombre());
        if (dto.activo() != null) td.setActivo(dto.activo());
    }
}
