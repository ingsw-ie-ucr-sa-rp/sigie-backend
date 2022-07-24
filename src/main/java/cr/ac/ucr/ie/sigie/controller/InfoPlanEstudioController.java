package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.InfoPlanEstudio;
import cr.ac.ucr.ie.sigie.service.InfoPlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/agregarinfoplanestudio")

public class InfoPlanEstudioController {

    @Autowired
    private InfoPlanEstudioService service;

    @PostMapping("/saveInfoPlanEstudio")
    public void insertPlanEstudio(@RequestBody InfoPlanEstudio p) { service.save(p);
    }

    @GetMapping("/getAllInfoPlan")
    public List<InfoPlanEstudio> getInfoPlanEstudios() { return service.listAll(); }

    @GetMapping("/getInfoPlanById/{id}")
    public ResponseEntity<InfoPlanEstudio> get(@PathVariable Integer id) {
        try {
            InfoPlanEstudio planEstudio = service.get(id);
            return new ResponseEntity<InfoPlanEstudio>(planEstudio, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<InfoPlanEstudio>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateinfoPlan/{id}")
    public ResponseEntity<InfoPlanEstudio> update(@RequestBody InfoPlanEstudio planEstudio, @PathVariable Integer id) {
        try {
            service.save(planEstudio);
            return new ResponseEntity<InfoPlanEstudio>(planEstudio, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<InfoPlanEstudio>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteInfoPlan/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
