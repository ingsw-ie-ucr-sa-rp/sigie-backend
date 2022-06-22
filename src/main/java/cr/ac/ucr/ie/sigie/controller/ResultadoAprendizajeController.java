package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IResultadoAprendizaje;
import cr.ac.ucr.ie.sigie.service.ResultadosAprendizajeService;
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
public class ResultadoAprendizajeController {
    @Autowired
    private ResultadosAprendizajeService service;

    @GetMapping("/")
    public ResponseEntity<List<IResultadoAprendizaje>> list() {
        List<IResultadoAprendizaje> resultadosAprendizaje = service.getResultadosAprendizaje();
        return new ResponseEntity<List<IResultadoAprendizaje>>(resultadosAprendizaje, HttpStatus.OK);
    }
}
