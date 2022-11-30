package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.entity.DescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.entity.Enfasis;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IDescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.service.DescripcionPlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


    @CrossOrigin(origins = "http://localhost:4200")
    @RestController
    @RequestMapping(path = "/api/descripcionplanestudio")
    public class DescripcionPlanEstudioController {

        public void setService(DescripcionPlanEstudioService service){this.service = service;}

        @Autowired
        private DescripcionPlanEstudioService service;

        @GetMapping("/")
        public ResponseEntity<List<IDescripcionPlanEstudio>> list() {
            List<IDescripcionPlanEstudio> descripcionesPlanEstudio = service.getDescripcionesPlanEstudio();
            return new ResponseEntity<List<IDescripcionPlanEstudio>>(descripcionesPlanEstudio, HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public DescripcionPlanEstudio get(@PathVariable int id) {
            return service.get(id);
        }

        @PostMapping("/add")
        public void add(@RequestBody DescripcionPlanEstudio descripcionPlanEstudio) {
            try {
                service.save(descripcionPlanEstudio);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

