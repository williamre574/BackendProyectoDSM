package com.dsm.dsm.Repository;

import com.dsm.dsm.Model.Pacientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PacienteRepository implements INPacienteRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Pacientes> findAll() {
        String sql = "select * from pacientes";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Pacientes.class));

    }

    @Override
    public int save(Pacientes pacientes) {
        String sql = "INSERT into pacientes values (?????)";
        return jdbcTemplate.update(sql, new Object[]{pacientes.getNombre(), pacientes.getEdad(), pacientes.getRaza(), pacientes.getEspecie(), pacientes.getPeso()} );

    }

    @Override
    public int update(Pacientes pacientes) {
        String sql = "UPDATE pacientes SET nombre = ?, edad = ?, raza = ?, especie = ?, peso = ? WHERE id = ?";
        return jdbcTemplate.update(sql, pacientes.getNombre(), pacientes.getEdad(), pacientes.getRaza(), pacientes.getEspecie(), pacientes.getPeso(), pacientes.getPacienteID());
    }

    @Override
    public int deleteById(int id) {
        String sql = "DELETE FROM pacientes WHERE PacienteID = ?";
        return jdbcTemplate.update(sql, id);
    }
}
