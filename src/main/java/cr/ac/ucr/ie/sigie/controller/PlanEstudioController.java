package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IPlanEstudio;
import cr.ac.ucr.ie.sigie.service.PlanEstudioService;
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
@RequestMapping(path = "/api/planestudio")
@Tag(name = "Planes de Estudio", description = "Endpoints para gestionar planes de estudio.")
public class PlanEstudioController {

    @Autowired
    private PlanEstudioService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de planes de estudio.")
    public ResponseEntity<List<IPlanEstudio>> list() {
        List<IPlanEstudio> planesEstudio = service.getPlanesEstudio();
        return new ResponseEntity<>(planesEstudio, HttpStatus.OK);
    }

}
