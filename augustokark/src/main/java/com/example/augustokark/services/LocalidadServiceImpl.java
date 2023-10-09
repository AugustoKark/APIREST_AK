package com.example.augustokark.services;
import com.example.augustokark.entities.Localidad;
import org.springframework.stereotype.Service;
import com.example.augustokark.repositories.BaseRepository;
import com.example.augustokark.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;


public interface LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
