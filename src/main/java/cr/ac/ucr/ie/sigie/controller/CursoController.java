package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/curso")
public class CursoController {

    @Autowired
    private CursoService service;

    @GetMapping("/cursos")
    public List<Curso> list() {
        return service.listAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Curso curso) {
        try {
            service.save(curso);
        } catch (Exception e) {
           //TODO
        }
    }
}
