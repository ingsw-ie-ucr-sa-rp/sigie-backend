package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IUnidadAcademica;
import cr.ac.ucr.ie.sigie.service.UnidadAcademicaService;
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
@RequestMapping(path = "/api/unidadacademica")
@Tag(name = "Unidades académicas", description = "Endpoints para gestionar unidades académicas.")
public class UnidadAcademicaController {
    @Autowired
    private UnidadAcademicaService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de unidades académicas.")
    public ResponseEntity<List<IUnidadAcademica>> list() {
        List<IUnidadAcademica> unidadesAcademicas = service.getUnidadesAcademicas();
        return new ResponseEntity<>(unidadesAcademicas, HttpStatus.OK);
    }

}