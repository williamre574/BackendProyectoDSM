package com.dsm.dsm.Repository;

import com.dsm.dsm.Model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
 //  List<Cita> findAll();
}