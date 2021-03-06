package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IModalidad;
import cr.ac.ucr.ie.sigie.service.ModalidadService;
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
@RequestMapping(path = "/api/modalidad")
public class ModalidadController {

    @Autowired
    private ModalidadService service;

    @GetMapping("/")
    public ResponseEntity<List<IModalidad>> list() {
        List<IModalidad> modalidades = service.getModalidades();
        return new ResponseEntity<List<IModalidad>>(modalidades, HttpStatus.OK);
    }

}
