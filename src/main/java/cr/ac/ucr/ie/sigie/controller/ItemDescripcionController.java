package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemDescripcion;
import cr.ac.ucr.ie.sigie.service.ItemDescripcionService;
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
@RequestMapping(path = "/api/itemdescripcion")
@Tag(name = "Items de descripción", description = "Endpoints para gestionar items de descripción.")
public class ItemDescripcionController {
    @Autowired
    private ItemDescripcionService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de items de descripción.")
    public ResponseEntity<List<IItemDescripcion>> list() {
        List<IItemDescripcion> itemesDescripcion = service.getItemesDescripcion();
        return new ResponseEntity<>(itemesDescripcion, HttpStatus.OK);
    }

}
