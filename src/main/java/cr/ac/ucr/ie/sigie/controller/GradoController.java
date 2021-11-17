package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.Grado;
import cr.ac.ucr.ie.sigie.service.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/grado")
public class GradoController {

    @Autowired
    private GradoService service;

    @GetMapping("/grados")
    //@GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Grado> list() {
        return service.listAll();
    }

}
