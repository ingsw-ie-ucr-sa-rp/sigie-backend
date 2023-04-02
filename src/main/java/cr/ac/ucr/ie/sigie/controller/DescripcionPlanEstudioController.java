package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IDescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.service.DescripcionPlanEstudioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@CrossOrigin
@RestController
@RequestMapping(path = "/api/descripcionplanestudio")
@Tag(name = "Descripciones de planes de estudio", description = "Endpoints para gestionar descripciones de plan de estudios.")
public class DescripcionPlanEstudioController {

    public void setService(DescripcionPlanEstudioService service) {
        this.service = service;
    }

    @Autowired
    private DescripcionPlanEstudioService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de descripciones de plan de estudios.")
    public ResponseEntity<List<IDescripcionPlanEstudio>> list() {
        List<IDescripcionPlanEstudio> descripcionesPlanEstudio = service.getDescripcionesPlanEstudio();
        return new ResponseEntity<>(descripcionesPlanEstudio, HttpStatus.OK);
    }
}

