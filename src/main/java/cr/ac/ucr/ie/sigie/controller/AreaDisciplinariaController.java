package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.service.AreaDisciplinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/areadisciplinaria")
public class AreaDisciplinariaController {

    @Autowired
    private AreaDisciplinariaService service;

    @PostMapping("/saveAreaDisciplinaria")
    public void insertAreaDisciplinaria(@RequestBody AreaDisciplinaria p) { service.save(p);
    }

    @GetMapping("/areasdisciplinarias")
    public List<AreaDisciplinaria> list() {
        return service.listAll();
    }

    @GetMapping("/getAreaDisciplinariaById/{id}")
    public ResponseEntity<AreaDisciplinaria> getAreaDisciplinaria(@PathVariable Integer id) {
        try {
            AreaDisciplinaria areaDisciplinaria = service.get(id);
            return new ResponseEntity<AreaDisciplinaria>(areaDisciplinaria, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<AreaDisciplinaria>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateAreaDisciplinaria/{id}")
    public ResponseEntity<AreaDisciplinaria> update(@RequestBody AreaDisciplinaria areaDisciplinaria, @PathVariable Integer id) {
        try {
            service.save(areaDisciplinaria);
            return new ResponseEntity<AreaDisciplinaria>(areaDisciplinaria, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<AreaDisciplinaria>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteAreaDisciplinaria/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
