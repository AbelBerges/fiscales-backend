package org.desarrollo.fiscalesbackend.dto;

import org.desarrollo.fiscalesbackend.model.Fiscal;

public record FotoFiscalResponseDTO(
        Integer idFoto,
        byte[] imagen,
        Integer idFiscal
) {
}
