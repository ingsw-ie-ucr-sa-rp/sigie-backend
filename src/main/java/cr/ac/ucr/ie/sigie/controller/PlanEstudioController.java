package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import cr.ac.ucr.ie.sigie.service.CursoService;
import cr.ac.ucr.ie.sigie.service.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/planEstudio")
public class PlanEstudioController {

    @Autowired
    private PlanEstudioService service;

    @GetMapping("/planesEstudios")
    public List<PlanEstudio> list() {
        return service.listAll();
    }


    @GetMapping("/{idPlanEstudio}")
    PlanEstudio one(@PathVariable int idPlanEstudio) {
        return service.get(idPlanEstudio);
    }

}