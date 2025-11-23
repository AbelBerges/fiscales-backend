package org.desarrollo.fiscalesbackend.mapper;

import org.desarrollo.fiscalesbackend.dto.CalleRequestDTO;
import org.desarrollo.fiscalesbackend.dto.CalleResponseDTO;
import org.desarrollo.fiscalesbackend.model.Calle;

public class CalleMapper {

    public static Calle aEntidadDeCreacion(CalleRequestDTO dto) {
        Calle crear = new Calle();
        crear.setNombre(dto.nombre());
        crear.setActiva(dto.activa());
        return crear;
    }


    public static CalleResponseDTO aResponseDTo(Calle laCalle) {
        return new CalleResponseDTO(laCalle.getIdCalle(), laCalle.getNombre(), laCalle.isActiva());
    }

    public static void datosActualizacionCalle(CalleRequestDTO dto, Calle calle) {
        if (dto.nombre() != null) calle.setNombre(dto.nombre());
        if (dto.activa() != null) calle.setActiva(dto.activa());
    }

}
