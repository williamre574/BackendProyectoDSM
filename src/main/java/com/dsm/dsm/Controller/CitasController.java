package com.dsm.dsm.Controller;

import com.dsm.dsm.Model.Cita;
import com.dsm.dsm.Service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitasController {

    private final CitaService citaService;

    @Autowired
    public CitasController(CitaService citaService) {
        this.citaService = citaService;
    }

    @GetMapping("/list")
    public List<Cita> getAllCitas() {
        return citaService.getAllCitas();
    }
}
