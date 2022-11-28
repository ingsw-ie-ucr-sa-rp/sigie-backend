package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import cr.ac.ucr.ie.sigie.entity.UnidadAcademica;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IPlanEstudio;
import cr.ac.ucr.ie.sigie.service.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/planestudio")
public class PlanEstudioController {

    @Autowired
    private PlanEstudioService service;

    @GetMapping("/")
    public ResponseEntity<List<IPlanEstudio>> list() {
        List<IPlanEstudio> planesEstudio = service.getPlanesEstudio();
        return new ResponseEntity<List<IPlanEstudio>>(planesEstudio, HttpStatus.OK);
    }

    @PostMapping("/")
    public void add(@RequestBody PlanEstudio planEstudio) {
        try {
            service.save(planEstudio);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
