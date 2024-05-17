package com.dsm.dsm.Service;

import com.dsm.dsm.Model.Cita;
import com.dsm.dsm.Repository.CitaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CitaService {

    private final CitaRepository citaRepository;


    @Autowired
    public CitaService(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public List<Cita> getAllCitas() {
        return citaRepository.findAll();
    }

    public Cita saveCita(Cita cita) {
        return citaRepository.save(cita);
    }


}
