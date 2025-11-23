package org.desarrollo.fiscalesbackend.mapper;

import org.desarrollo.fiscalesbackend.dto.TipoFiscalRequestDTO;
import org.desarrollo.fiscalesbackend.dto.TipoFiscalResponseDTO;
import org.desarrollo.fiscalesbackend.model.TipoFiscal;

public class TipoFiscalMapper {

    public static TipoFiscal aEntidadCreacion(TipoFiscalRequestDTO dto) {
        TipoFiscal nuevo = new TipoFiscal(dto.toString(), dto.activo());
        return nuevo;
    }

    public static TipoFiscalResponseDTO aEntidadResponseDTO(TipoFiscal tipoFiscal) {
        return new TipoFiscalResponseDTO(
                tipoFiscal.getIdTipoFiscal(),
                tipoFiscal.getNombre(),
                tipoFiscal.isActivo()
        );
    }

    public static void paraActualizarTipoFiscal(TipoFiscalRequestDTO dto, TipoFiscal tf) {
        if (dto.nombre() != null) tf.setNombre(dto.nombre());
        if (dto.activo() != null) tf.setActivo(dto.activo());
    }

}
