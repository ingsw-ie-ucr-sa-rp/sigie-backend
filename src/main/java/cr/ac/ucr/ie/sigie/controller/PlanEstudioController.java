package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IPlanEstudio;
import cr.ac.ucr.ie.sigie.service.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.NoSuchElementException;

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

    @GetMapping("/getPlanEstudio/{id}")
    public ResponseEntity<PlanEstudio> getPlanEstudioById(@PathVariable Integer id){
        try {
            PlanEstudio planEstudio = service.get(id);
            return new ResponseEntity<PlanEstudio>(planEstudio, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<PlanEstudio>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/savePlanEstudio")
    public void insertPlanEstudio(PlanEstudio p) { service.save(p);
    }

    @PostMapping("/updatePlanEstudio")
    public ResponseEntity<PlanEstudio> updatePlanEstudio(@RequestBody PlanEstudio p, @PathVariable Integer id) {
        try {
            PlanEstudio existingPlanEstudio = service.get(id);
            service.save(existingPlanEstudio);
            return new ResponseEntity<PlanEstudio>(p, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<PlanEstudio>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deletePlanEstudio/{id}")
    public void deletePlanEstudio(@PathVariable int id) {
        service.delete(id);
    }

}
