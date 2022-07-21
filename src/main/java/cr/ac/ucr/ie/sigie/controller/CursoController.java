package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICurso;
import cr.ac.ucr.ie.sigie.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/curso")
public class CursoController {

    public void setService(CursoService service) {
        this.service = service;
    }

    @Autowired
    private CursoService service;

    @GetMapping("/")
    public ResponseEntity<List<ICurso>> list() {
        List<ICurso> cursos = service.getCursos();
        return new ResponseEntity<List<ICurso>>(cursos, HttpStatus.OK);
    }


    @PostMapping("/")
    public ResponseEntity add(@RequestBody Curso curso) {

        if(cursoExist(curso)==false) {
            try {
                service.save(curso);
                return new ResponseEntity(HttpStatus.OK);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else{
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    public boolean cursoExist(Curso curso){
        List<ICurso> cursos = service.getCursos();
        boolean cursoExist = false;
        for (int i = 0; i<cursos.size();i++){
            if(cursos.get(i).getSigla().equals(curso.getSigla())||cursos.get(i).getNombre().equals(curso.getNombre())){
                return cursoExist = true;
            }
        }
        return cursoExist;
    }

}
