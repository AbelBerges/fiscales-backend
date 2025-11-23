package org.desarrollo.fiscalesbackend.service;

import jakarta.persistence.EntityManager;
import org.desarrollo.fiscalesbackend.model.Fiscal;
import org.desarrollo.fiscalesbackend.model.FotoFiscal;
import org.desarrollo.fiscalesbackend.repository.FiscalRepository;
import org.desarrollo.fiscalesbackend.repository.FotoFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FotoFiscalService {

    @Autowired
    private FotoFiscalRepository repoFoto;
    @Autowired
    private FiscalRepository repo;
    @Autowired
    private EntityManager em;

    public boolean guardarFoto(Integer idFiscal, MultipartFile archivo) throws IOException {
        FotoFiscal nuevo = new FotoFiscal();
        nuevo.setFiscal(em.getReference(Fiscal.class, idFiscal));
        nuevo.setImagen(archivo.getBytes());
        repoFoto.save(nuevo);
        return true;
    }

}
