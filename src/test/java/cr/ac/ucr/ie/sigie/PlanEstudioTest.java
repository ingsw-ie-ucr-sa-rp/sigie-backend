package cr.ac.ucr.ie.sigie;

import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;
import cr.ac.ucr.ie.sigie.service.PlanEstudioService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@SpringBootTest
class PlanEstudioTest {

    PlanEstudioService service = new PlanEstudioService();
    PlanEstudio planEstudio = new PlanEstudio();

    @Test
    @GetMapping("/planesestudio")
    public List<PlanEstudio> list() {
        return service.listAll();
    }

    @Test
    @GetMapping("/getPlanEstudio/1") //Parámetro
    public ResponseEntity<PlanEstudio> getPlanEstudioById(@PathVariable Integer id){
        try {
            PlanEstudio planEstudio = service.get(1);
            return new ResponseEntity<PlanEstudio>(planEstudio, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<PlanEstudio>(HttpStatus.NOT_FOUND);
        }
    }

    @Test
    @PostMapping("/savePlanEstudio")
    public void insertPlanEstudio(PlanEstudio p) { insertPlanEstudio(planEstudio);
    }

    @Test
    @PostMapping("/updatePlanEstudio") //Usando id = 1
    public ResponseEntity<PlanEstudio> updatePlanEstudio(@RequestBody PlanEstudio p, @PathVariable Integer id) {
        try {
            PlanEstudio existingPlanEstudio = service.get(1);
            service.save(existingPlanEstudio);
            return new ResponseEntity<PlanEstudio>(p, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<PlanEstudio>(HttpStatus.NOT_FOUND);
        }
    }

    @Test
    @DeleteMapping("/deletePlanEstudio/1")
    public void deletePlanEstudio(@PathVariable int id) {
        service.delete(1);
    }

}
