package com.dsm.dsm.Controller;

import com.dsm.dsm.Model.Pacientes;
import com.dsm.dsm.Model.ServiceResponse;
import com.dsm.dsm.Repository.INPacienteRepository;
import com.dsm.dsm.Service.IPacientesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Veterinaria/Pacientes")
@CrossOrigin("*")
public class PacienteController {
    private IPacientesService pacientesService;

    // Constructor para la inyección de dependencias
    public PacienteController(IPacientesService pacientesService) {
        this.pacientesService = pacientesService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Pacientes>> list() {
        List<Pacientes> result = pacientesService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceResponse> save(@RequestBody Pacientes pacientes) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = pacientesService.save(pacientes);
        if (result == 1) {
            serviceResponse.setMessage("Paciente guardado exitosamente!");
            return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
        } else {
            serviceResponse.setMessage("Error al guardar el paciente.");
            return new ResponseEntity<>(serviceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

