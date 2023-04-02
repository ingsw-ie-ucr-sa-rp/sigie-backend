package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IEnfasis;
import cr.ac.ucr.ie.sigie.service.EnfasisService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@RequestMapping(path = "/api/enfasis")
@Tag(name = "Énfasis", description = "Endpoints para gestionar énfasis.")
public class EnfasisController {
    @Autowired
    private EnfasisService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de énfasis.")
    public ResponseEntity<List<IEnfasis>> list() {
        List<IEnfasis> enfasis = service.getEnfasis();
        return new ResponseEntity<>(enfasis, HttpStatus.OK);
    }

}