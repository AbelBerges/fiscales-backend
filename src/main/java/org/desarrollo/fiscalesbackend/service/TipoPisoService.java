package org.desarrollo.fiscalesbackend.service;

import org.desarrollo.fiscalesbackend.dto.TipoFiscalResponseDTO;
import org.desarrollo.fiscalesbackend.dto.TipoPisoRequestDTO;
import org.desarrollo.fiscalesbackend.dto.TipoPisoResponseDTO;
import org.desarrollo.fiscalesbackend.mapper.TipoFiscalMapper;
import org.desarrollo.fiscalesbackend.mapper.TipoPisoMapper;
import org.desarrollo.fiscalesbackend.model.TipoPiso;
import org.desarrollo.fiscalesbackend.repository.TipoPisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPisoService {

    @Autowired
    private TipoPisoRepository repo;


    public List<TipoPisoResponseDTO> listarTiposPisos() {
        List<TipoPisoResponseDTO> lista = repo.findAll()
                .stream()
                .map(TipoPisoMapper::aEntidadResponseDTO)
                .toList();
        return lista;
    }

    public TipoPisoResponseDTO porIdTipoTipo(Integer id) {
        return repo.findById(id)
                .map(TipoPisoMapper::aEntidadResponseDTO)
                .orElse(null);
    }

    public List<TipoPisoResponseDTO> listarPorNombre(String nombre) {
        List<TipoPisoResponseDTO> lista = repo.findByNombreContainingIgnoreCase(nombre)
                .stream()
                .map(TipoPisoMapper::aEntidadResponseDTO)
                .toList();
        return lista;
    }

    public TipoPisoResponseDTO guardarTP(TipoPisoRequestDTO dto){
        TipoPiso tp = TipoPisoMapper.aEntidadDeCreacion(dto);
        TipoPiso nuevo = repo.save(tp);
        return TipoPisoMapper.aEntidadResponseDTO(nuevo);
    }

    public boolean actualizarTipoPiso(Integer id, TipoPisoRequestDTO dto) {
        return repo.findById(id).map(existe -> {
            TipoPisoMapper.actualizarTipoPiso(dto, existe);
            repo.save(existe);
            return true;
        }).orElse(false);
    }
}
