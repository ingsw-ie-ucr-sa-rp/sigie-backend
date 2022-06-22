package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IPlanEstudio;
import cr.ac.ucr.ie.sigie.service.PlanEstudioService;
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
@RequestMapping(path = "/api/planestudio")
public class PlanEstudioController {

    @Autowired
    private PlanEstudioService service;

    @GetMapping("/")
    public ResponseEntity<List<IPlanEstudio>> list() {
        List<IPlanEstudio> planesEstudio = service.getPlanesEstudio();
        return new ResponseEntity<List<IPlanEstudio>>(planesEstudio, HttpStatus.OK);
    }

}
