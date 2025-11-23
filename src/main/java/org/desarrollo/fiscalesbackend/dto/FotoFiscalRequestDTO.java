package org.desarrollo.fiscalesbackend.dto;

import org.desarrollo.fiscalesbackend.model.Fiscal;

public record FotoFiscalRequestDTO(
        byte[] imagen,
        Integer idFiscal
) {
}
