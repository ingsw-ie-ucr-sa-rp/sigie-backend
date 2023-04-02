package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IAreaDisciplinaria;
import cr.ac.ucr.ie.sigie.service.AreaDisciplinariaService;
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
@RequestMapping(path = "/api/areadisciplinaria")
@Tag(name = "Áreas Disciplinarias", description = "Endpoints para gestionar áreas disciplinarias.")
public class AreaDisciplinariaController {

    @Autowired
    private AreaDisciplinariaService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de áreas disciplinarias.")
    public ResponseEntity<List<IAreaDisciplinaria>> list() {
        List<IAreaDisciplinaria> areasDisciplinarias = service.getAreasDisciplinarias();
        return new ResponseEntity<>(areasDisciplinarias, HttpStatus.OK);
    }
}