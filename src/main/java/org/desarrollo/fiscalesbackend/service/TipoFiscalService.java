package org.desarrollo.fiscalesbackend.service;

import org.desarrollo.fiscalesbackend.dto.TipoFiscalRequestDTO;
import org.desarrollo.fiscalesbackend.dto.TipoFiscalResponseDTO;
import org.desarrollo.fiscalesbackend.dto.TipoPisoRequestDTO;
import org.desarrollo.fiscalesbackend.mapper.TipoFiscalMapper;
import org.desarrollo.fiscalesbackend.mapper.TipoPisoMapper;
import org.desarrollo.fiscalesbackend.model.TipoFiscal;
import org.desarrollo.fiscalesbackend.model.TipoPiso;
import org.desarrollo.fiscalesbackend.repository.TipoFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoFiscalService {

    @Autowired
    private TipoFiscalRepository repo;

    public List<TipoFiscalResponseDTO> listarTiposFiscal() {
        List<TipoFiscalResponseDTO> lista = repo.findAll()
                .stream()
                .map(TipoFiscalMapper::aEntidadResponseDTO)
                .toList();
        return lista;
    }

    public TipoFiscalResponseDTO buscarPorId(Integer id) {
        return repo.findById(id)
                .map(TipoFiscalMapper::aEntidadResponseDTO)
                .orElse(null);
    }

    public TipoFiscalResponseDTO listaPorNombre(String nombre) {
        TipoFiscal tpf = repo.findByNombreContainingIgnoreCase(nombre);
        return TipoFiscalMapper.aEntidadResponseDTO(tpf);
    }

    public TipoFiscalResponseDTO guardarTipoFiscal(TipoFiscalRequestDTO dto) {
        TipoFiscal fs = TipoFiscalMapper.aEntidadCreacion(dto);
        TipoFiscal creado = repo.save(fs);
        return TipoFiscalMapper.aEntidadResponseDTO(creado);
    }

    public boolean actualizarTipoFiscal(Integer id, TipoFiscalRequestDTO dto) {
        return repo.findById(id).map(existe -> {
            TipoFiscalMapper.paraActualizarTipoFiscal(dto, existe);
            repo.save(existe);
            return true;
        }).orElse(false);
    }
}
