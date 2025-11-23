package org.desarrollo.fiscalesbackend.mapper;

import jakarta.persistence.EntityManager;
import org.desarrollo.fiscalesbackend.dto.DireccionRequestDTO;
import org.desarrollo.fiscalesbackend.dto.DireccionResponseDTO;
import org.desarrollo.fiscalesbackend.model.Calle;
import org.desarrollo.fiscalesbackend.model.Direccion;
import org.desarrollo.fiscalesbackend.model.TipoDepartamento;
import org.desarrollo.fiscalesbackend.model.TipoPiso;

public class DireccionMapper {


    public static Direccion aEntidadCreacion(DireccionRequestDTO dto, EntityManager em) {
        Direccion nuevo = new Direccion();
        nuevo.setCalle(em.getReference(Calle.class, dto.idCalle()));
        nuevo.setAltura(dto.altura());
        nuevo.setTipoPiso(em.getReference(TipoPiso.class, dto.idTipoPiso()));
        nuevo.setTipoDepartamento(em.getReference(TipoDepartamento.class, dto.idTipoDepartamento()));
        return nuevo;
    }

    public static DireccionResponseDTO aEntidadResponseDTO(Direccion direccion) {
        return new DireccionResponseDTO(
                direccion.getIdDireccion(),
                direccion.getCalle().getIdCalle(),
                direccion.getAltura(),
                direccion.getTipoPiso().getIdPiso(),
                direccion.getTipoDepartamento().getIdDepartamento()
        );
    }

    public static void paraActualizacionDireccion(DireccionRequestDTO dto, Direccion direccion, EntityManager em) {
        if (dto.idCalle() != null) direccion.setCalle(em.getReference(Calle.class, dto.idCalle()));
        if (dto.altura() != null) direccion.setAltura(dto.altura());
        if (dto.idTipoPiso() != null) direccion.setTipoPiso(em.getReference(TipoPiso.class, dto.idCalle()));
        if (dto.idTipoDepartamento() != null) direccion.setTipoDepartamento(em.getReference(TipoDepartamento.class, dto.idTipoDepartamento()));
    }

}
