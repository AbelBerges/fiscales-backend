package org.desarrollo.fiscalesbackend.mapper;

import jakarta.persistence.EntityManager;
import org.desarrollo.fiscalesbackend.dto.FotoFiscalRequestDTO;
import org.desarrollo.fiscalesbackend.dto.FotoFiscalResponseDTO;
import org.desarrollo.fiscalesbackend.model.Fiscal;
import org.desarrollo.fiscalesbackend.model.FotoFiscal;

import java.util.Objects;

public class FotoFiscalMapper {


    public static FotoFiscal aEntidadDeCreacion(FotoFiscalRequestDTO dto, EntityManager em) {
        FotoFiscal crear = new FotoFiscal();
        crear.setImagen(dto.imagen());
        crear.setFiscal(em.getReference(Fiscal.class, dto.idFiscal()));
        return crear;
    }

    public static FotoFiscalResponseDTO aEntidadResponseDTO(FotoFiscal foto) {
        return new FotoFiscalResponseDTO(foto.getIdFoto(), foto.getImagen(), foto.getFiscal().getIdFiscal());
    }

    public static void actualizarFotoFiscal(FotoFiscalRequestDTO dto, FotoFiscal foto, EntityManager em) {
        if (dto.imagen() != null) foto.setImagen(dto.imagen());
        if (dto.idFiscal() != null && !Objects.equals(foto.getFiscal().getIdFiscal(), dto.idFiscal())) {
            foto.setFiscal(em.getReference(Fiscal.class, dto.idFiscal()));
        };
    }
}
