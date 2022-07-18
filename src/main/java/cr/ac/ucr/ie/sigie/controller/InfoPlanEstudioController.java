package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.InfoPlanEstudio;
import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import cr.ac.ucr.ie.sigie.entity.UnidadAcademica;
import cr.ac.ucr.ie.sigie.service.InfoPlanEstudioService;
import cr.ac.ucr.ie.sigie.service.PlanEstudioService;
import cr.ac.ucr.ie.sigie.service.UnidadAcademicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/agregarinfoplanestudio")

public class InfoPlanEstudioController {

    @Autowired
    private InfoPlanEstudioService service;

    @PostMapping("/saveInfoPlanEstudio")
    public void insertPlanEstudio(InfoPlanEstudio p) { service.save(p);
    }

}
