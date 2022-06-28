package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IReferenciaBibliografica;
import cr.ac.ucr.ie.sigie.service.ReferenciaBibliograficaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/referenciabibliografica")
public class ReferenciaBibliograficaController {
    @Autowired
    private ReferenciaBibliograficaService service;

    @GetMapping("/")
    public ResponseEntity<List<IReferenciaBibliografica>> list() {
        List<IReferenciaBibliografica> referenciasBibliograficas = service.getReferenciasBibliograficas();
        return new ResponseEntity<List<IReferenciaBibliografica>>(referenciasBibliograficas, HttpStatus.OK);
    }
}
