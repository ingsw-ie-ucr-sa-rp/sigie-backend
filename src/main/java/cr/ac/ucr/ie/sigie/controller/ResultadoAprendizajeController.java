package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IResultadoAprendizaje;
import cr.ac.ucr.ie.sigie.service.ResultadosAprendizajeService;
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
@RequestMapping(path = "/api/resultadoaprendizaje")
@Tag(name = "Resultados de aprendizaje", description = "Endpoints para gestionar resultados de aprendizaje.")
public class ResultadoAprendizajeController {
    @Autowired
    private ResultadosAprendizajeService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de resultados de aprendizaje.")
    public ResponseEntity<List<IResultadoAprendizaje>> list() {
        List<IResultadoAprendizaje> resultadosAprendizaje = service.getResultadosAprendizaje();
        return new ResponseEntity<>(resultadosAprendizaje, HttpStatus.OK);
    }
}
