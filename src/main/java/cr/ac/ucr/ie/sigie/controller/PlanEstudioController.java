package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import cr.ac.ucr.ie.sigie.service.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/planestudio")
public class PlanEstudioController {

    @Autowired
    private PlanEstudioService service;

    @GetMapping("/planesestudio")
    public List<PlanEstudio> list() {
        return service.listAll();
    }

}
