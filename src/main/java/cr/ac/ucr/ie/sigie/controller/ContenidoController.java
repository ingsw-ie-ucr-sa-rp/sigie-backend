package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IContenido;
import cr.ac.ucr.ie.sigie.service.ContenidoService;
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
public class ContenidoController {

    @Autowired
    private ContenidoService service;

    @GetMapping("/")
    public ResponseEntity<List<IContenido>> list() {
        List<IContenido> contenidos = service.getContenidos();
        return new ResponseEntity<List<IContenido>>(contenidos, HttpStatus.OK);
    }
}