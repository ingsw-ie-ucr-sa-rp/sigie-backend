package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.Modalidad;
import cr.ac.ucr.ie.sigie.entity.UnidadAcademica;
import cr.ac.ucr.ie.sigie.service.ModalidadService;
import cr.ac.ucr.ie.sigie.service.UnidadAcademicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping(path = "/api/unidad")
public class UnidadAcademicaController {


    @Autowired
    private UnidadAcademicaService service;

    @GetMapping("/unidades")
    public List<UnidadAcademica> list() {
        return service.listAll();
    }


}
