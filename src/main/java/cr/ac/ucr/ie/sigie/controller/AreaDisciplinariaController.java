package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IAreaDisciplinaria;
import cr.ac.ucr.ie.sigie.service.AreaDisciplinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/areadisciplinaria")
public class AreaDisciplinariaController {

    @Autowired
    private AreaDisciplinariaService service;

    @GetMapping("/")
    public ResponseEntity<List<IAreaDisciplinaria>> list() {
        List<IAreaDisciplinaria> areasDisciplinarias = service.getAreasDisciplinarias();
        return new ResponseEntity<List<IAreaDisciplinaria>>(areasDisciplinarias, HttpStatus.OK);
    }

    @PostMapping("/")
    public void add(@RequestBody AreaDisciplinaria areaDisciplinaria) {
        try {
            service.save(areaDisciplinaria);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}