package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IContenido;
import cr.ac.ucr.ie.sigie.service.ContenidoService;
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
@RequestMapping(path = "/api/contenido")
@Tag(name = "Contenidos", description = "Endpoints para gestionar contenidos.")
public class ContenidoController {

    @Autowired
    private ContenidoService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de contenidos.")
    public ResponseEntity<List<IContenido>> list() {
        List<IContenido> contenidos = service.getContenidos();
        return new ResponseEntity<>(contenidos, HttpStatus.OK);
    }
}