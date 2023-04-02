package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICurso;
import cr.ac.ucr.ie.sigie.service.CursoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/curso")
@Tag(name = "Cursos", description = "Endpoints para gestionar cursos.")
public class CursoController {

    public void setService(CursoService service) {
        this.service = service;
    }

    @Autowired
    private CursoService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de cursos.")
    public ResponseEntity<List<ICurso>> list() {
        List<ICurso> cursos = service.getCursos();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @PostMapping("/")
    @Operation(description = "Agregar un nuevo curso.")
    public void add(@RequestBody Curso curso) {
        try {
            service.save(curso);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}


