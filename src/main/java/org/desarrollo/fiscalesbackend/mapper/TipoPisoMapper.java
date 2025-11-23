package org.desarrollo.fiscalesbackend.mapper;

import org.desarrollo.fiscalesbackend.dto.TipoPisoRequestDTO;
import org.desarrollo.fiscalesbackend.dto.TipoPisoResponseDTO;
import org.desarrollo.fiscalesbackend.model.TipoPiso;

public class TipoPisoMapper {

    public static TipoPiso aEntidadDeCreacion(TipoPisoRequestDTO dto) {
        TipoPiso tp = new TipoPiso(dto.nombre(), dto.activo());
        return tp;
    }

    public static TipoPisoResponseDTO aEntidadResponseDTO(TipoPiso tp) {
        return new TipoPisoResponseDTO(tp.getIdPiso(), tp.getNombre(), tp.isActivo());
    }

    public static void actualizarTipoPiso(TipoPisoRequestDTO dto, TipoPiso tp) {
        if (dto.nombre() != null) tp.setNombre(dto.nombre());
        if (dto.activo() != null) tp.setActivo(dto.activo());
    }


}
