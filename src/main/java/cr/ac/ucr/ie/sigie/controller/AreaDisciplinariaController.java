package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.service.AreaDisciplinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/areadisciplinaria")
public class AreaDisciplinariaController {

    @Autowired
    private AreaDisciplinariaService service;

    @GetMapping("/areasdisciplinarias")
    public List<AreaDisciplinaria> list() {
        return service.listAll();
    }

}
