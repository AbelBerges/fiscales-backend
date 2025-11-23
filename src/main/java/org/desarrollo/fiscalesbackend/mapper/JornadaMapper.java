package org.desarrollo.fiscalesbackend.mapper;

import org.desarrollo.fiscalesbackend.dto.JornadaRequestDTO;
import org.desarrollo.fiscalesbackend.dto.JornadaResponseDTO;
import org.desarrollo.fiscalesbackend.model.Jornada;

public class JornadaMapper {

    public static Jornada aEntidadCreacion(JornadaRequestDTO dto) {
        Jornada jornada = new Jornada();
        jornada.setTipoJornada(dto.tipoJornada());
        return jornada;
    }

    public static JornadaResponseDTO aResponseDTO(Jornada jornada) {
        return new JornadaResponseDTO(
                jornada.getIdJornada(),
                jornada.getTipoJornada()
        );
    }

    public static void paraActualizarJornada(JornadaRequestDTO dto, Jornada existe) {
        if (dto.tipoJornada() != null) existe.setTipoJornada(dto.tipoJornada());
    }
}
