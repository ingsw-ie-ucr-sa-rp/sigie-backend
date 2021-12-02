package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value="/api/curso", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/getCursos")
    public ResponseEntity<List<Curso>> findAll(){
        List<Curso> cursos = cursoService.listAll();
        return new ResponseEntity<List<Curso>>(cursos, HttpStatus.OK);
    }

    @GetMapping("/getCursos/{id}")
    public ResponseEntity<Curso> findById(@RequestParam Integer id){
        Curso curso = cursoService.get(id);
        return new ResponseEntity<Curso>(curso, HttpStatus.OK);
    }

    @GetMapping("/getCursosPorPlanEstudioId/{id}")
    public ResponseEntity<List<Curso>> findByPlanId(@RequestParam Integer planId){
        List<Curso> curso = cursoService.findByPlanId(planId);
        return new ResponseEntity<List<Curso>>(curso, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Curso> update(@RequestBody Curso course){
        try{
            cursoService.save(course);
            return new ResponseEntity<Curso>(course,HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Curso>(HttpStatus.NOT_FOUND);
        }
    }

}
