package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.Contenido;
import cr.ac.ucr.ie.sigie.entity.Enfasis;
import cr.ac.ucr.ie.sigie.service.ContenidoService;
import cr.ac.ucr.ie.sigie.service.EnfasisService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/contenidos")
    public List<Contenido> list() {
        return service.listAll();
    }
}