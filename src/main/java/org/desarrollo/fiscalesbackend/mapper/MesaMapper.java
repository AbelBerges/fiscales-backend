package org.desarrollo.fiscalesbackend.mapper;

import jakarta.persistence.EntityManager;
import org.desarrollo.fiscalesbackend.dto.MesaRequestDTO;
import org.desarrollo.fiscalesbackend.dto.MesaResponseDTO;
import org.desarrollo.fiscalesbackend.model.Establecimiento;
import org.desarrollo.fiscalesbackend.model.Mesa;

import java.util.Objects;

public class MesaMapper {

    public static Mesa aEntidadCreacion(MesaRequestDTO dto, EntityManager em) {
        Mesa mesa = new Mesa();
        mesa.setNumeroMesa(dto.numeroMesa());
        mesa.setEstablecimiento(em.getReference(Establecimiento.class, dto.idEstablecimiento()));
        return mesa;
    }

    public static MesaResponseDTO aResponseDTO(Mesa mesa) {
        return new MesaResponseDTO(
                mesa.getIdMesa(),
                mesa.getNumeroMesa(),
                mesa.getEstablecimiento() != null ? mesa.getEstablecimiento().getIdEstablecimiento() : null
        );
    }

    public static void paraActualziarMesa(MesaRequestDTO dto, Mesa mesa, EntityManager em) {
        if (dto.numeroMesa() != null) {
            mesa.setNumeroMesa(dto.numeroMesa());
        }
        if (dto.idEstablecimiento() != null && !Objects.equals(dto.idEstablecimiento(), mesa.getEstablecimiento().getIdEstablecimiento())) {
            mesa.setEstablecimiento(em.getReference(Establecimiento.class, dto.idEstablecimiento()));
        }
    }
}
