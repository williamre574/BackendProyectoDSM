package com.dsm.dsm.Service;

import com.dsm.dsm.Model.Pacientes;
import com.dsm.dsm.Repository.INPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacientesService implements IPacientesService{
    @Autowired
    private INPacienteRepository INPacienteRepository;
    @Override
    public List<Pacientes> findAll() {
       List<Pacientes> list;
       try {
        list = INPacienteRepository.findAll();
       }catch (Exception ex){
           throw ex;
       }
       return list;
    }

    @Override
    public int save(Pacientes pacientes) {
        int row;
        try {
            row = INPacienteRepository.save(pacientes);
        } catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int update(Pacientes pacientes) {
       int row;
       try {
           row = INPacienteRepository.update(pacientes);
       }catch (Exception ex){
           throw ex;
       }
       return row;
    }

    @Override
    public int deleteById(int id) {
        int row;
        try {
            row = INPacienteRepository.deleteById(id);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }
}
