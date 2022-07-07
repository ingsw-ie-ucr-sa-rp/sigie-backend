package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IDescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.service.DescripcionPlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


    @CrossOrigin
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
    }

