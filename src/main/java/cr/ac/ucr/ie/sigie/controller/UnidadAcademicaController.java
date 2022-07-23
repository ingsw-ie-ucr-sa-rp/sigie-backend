package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICurso;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IUnidadAcademica;
import cr.ac.ucr.ie.sigie.service.UnidadAcademicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/unidadacademica")
public class UnidadAcademicaController {
    @Autowired
    private UnidadAcademicaService service;

    @GetMapping("/obtenertodos")
    public ResponseEntity<List<IUnidadAcademica>> list() {
        List<IUnidadAcademica> unidadesAcademicas = service.getUnidadesAcademicas();
        return new ResponseEntity<List<IUnidadAcademica>>(unidadesAcademicas, HttpStatus.OK);
    }

    @GetMapping("/obtenerunidadespornombre")
    public ResponseEntity<List<IUnidadAcademica>> getUnidadesPorNombre(@RequestParam String nombre) {
        List<IUnidadAcademica> unidades = service.getUnidadesAcademicasPorNombre(nombre);
        return new ResponseEntity<List<IUnidadAcademica>>(unidades, HttpStatus.OK);
    }



}