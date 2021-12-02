package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.service.AreaDisciplinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/area")
public class AreaDisciplinariaController {



    @Autowired
    private AreaDisciplinariaService service;

    @GetMapping("/areas")
    public List<AreaDisciplinaria> list() {
        return service.listAll();
    }

    @GetMapping("/{idAreaDisciplinaria}")
    AreaDisciplinaria one(@PathVariable int idAreaDisciplinaria) {

        return service.get(idAreaDisciplinaria);
    }
}

