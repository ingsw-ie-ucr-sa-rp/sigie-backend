package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.BloqueElectivos;
import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IBloqueElectivos;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IContenido;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICurso;
import cr.ac.ucr.ie.sigie.service.BloqueElectivosService;
import cr.ac.ucr.ie.sigie.service.ContenidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/bloqueElectivos")
public class BloqueElectivosController {

    @Autowired
    private BloqueElectivosService service;

    @GetMapping("/obtenertodos")
    public ResponseEntity<List<IBloqueElectivos>> list() {
        List<IBloqueElectivos> bloqueElectivos = service.getBloqueElectivos();
        return new ResponseEntity<List<IBloqueElectivos>>(bloqueElectivos, HttpStatus.OK);
    }

    @GetMapping("/obtenerporid")
    public ResponseEntity<BloqueElectivos> getBloquesPorId(@RequestParam int id) {
        BloqueElectivos cursos = service.get(id);
        return new ResponseEntity<BloqueElectivos>(cursos, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity add(@RequestBody BloqueElectivos bloqueElectivos) {

        if(bloqueElectivosExist(bloqueElectivos)==false) {
            try {
                service.save(bloqueElectivos);
                return new ResponseEntity(HttpStatus.OK);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else{
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    public boolean bloqueElectivosExist(BloqueElectivos bloqueElectivos){
        List<IBloqueElectivos> bloquesElectivos = service.getBloqueElectivos();
        boolean bloqueElectivosExist = false;
        for (int i = 0; i<bloquesElectivos.size();i++){
            if(bloquesElectivos.get(i).getIdBloqueElectivo() == bloqueElectivos.getIdBloqueElectivo()){
                return bloqueElectivosExist = true;
            }
        }
        return bloqueElectivosExist;
    }


}
