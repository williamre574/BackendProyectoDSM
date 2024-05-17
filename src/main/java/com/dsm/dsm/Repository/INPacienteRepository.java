package com.dsm.dsm.Repository;

import com.dsm.dsm.Model.Pacientes;

import java.util.List;

public interface INPacienteRepository {
    public List<Pacientes> findAll();
    public int save(Pacientes pacientes);
    public int update(Pacientes pacientes);
    public int deleteById(int id);
}
