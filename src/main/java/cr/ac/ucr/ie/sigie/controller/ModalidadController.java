package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IModalidad;
import cr.ac.ucr.ie.sigie.service.ModalidadService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/modalidad")
@Tag(name = "Modalidades", description = "Endpoints para gestionar modalidades.")
public class ModalidadController {

    @Autowired
    private ModalidadService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de modalidades.")
    public ResponseEntity<List<IModalidad>> list() {
        List<IModalidad> modalidades = service.getModalidades();
        return new ResponseEntity<>(modalidades, HttpStatus.OK);
    }

}
