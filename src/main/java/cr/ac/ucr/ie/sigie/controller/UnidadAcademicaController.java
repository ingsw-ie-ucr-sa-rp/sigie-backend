package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.UnidadAcademica;
import cr.ac.ucr.ie.sigie.service.UnidadAcademicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/unidadacademica")
public class UnidadAcademicaController {
    @Autowired
    private UnidadAcademicaService service;

    @PostMapping("/saveUnidadAcademica")
    public void insertUnidadAcademica(@RequestBody UnidadAcademica p) { service.save(p);
    }

    @GetMapping("/unidadesacademicas")
    public List<UnidadAcademica> list() {
        return service.listAll();
    }

    @GetMapping("/getUnidadAcademicaById/{id}")
    public ResponseEntity<UnidadAcademica> getUnidadAcademica(@PathVariable Integer id) {
        try {
            UnidadAcademica unidadAcademica = service.get(id);
            return new ResponseEntity<UnidadAcademica>(unidadAcademica, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<UnidadAcademica>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateUnidadAcademica/{id}")
    public ResponseEntity<UnidadAcademica> update(@RequestBody UnidadAcademica unidadAcademica, @PathVariable Integer id) {
        try {
            service.save(unidadAcademica);
            return new ResponseEntity<UnidadAcademica>(unidadAcademica, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<UnidadAcademica>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteUnidadAcademica/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}