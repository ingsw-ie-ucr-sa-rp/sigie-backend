package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.entity.DescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.entity.Enfasis;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IEnfasis;
import cr.ac.ucr.ie.sigie.service.EnfasisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/enfasis")
public class EnfasisController {
    @Autowired
    private EnfasisService service;

    @GetMapping("/")
    public ResponseEntity<List<IEnfasis>> list() {
        List<IEnfasis> enfasis = service.getEnfasis();
        return new ResponseEntity<List<IEnfasis>>(enfasis, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Enfasis get(@PathVariable int id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Enfasis enfasis) {
        try {
            service.save(enfasis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}