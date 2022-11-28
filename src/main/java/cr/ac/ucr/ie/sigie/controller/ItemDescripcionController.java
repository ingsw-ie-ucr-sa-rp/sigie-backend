package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.ItemDescripcion;
import cr.ac.ucr.ie.sigie.entity.ItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemDescripcion;
import cr.ac.ucr.ie.sigie.service.ItemDescripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/itemdescripcion")
public class ItemDescripcionController {
    @Autowired
    private ItemDescripcionService service;

    @GetMapping("/")
    public ResponseEntity<List<IItemDescripcion>> list() {
        List<IItemDescripcion> itemesDescripcion = service.getItemesDescripcion();
        return new ResponseEntity<List<IItemDescripcion>>(itemesDescripcion, HttpStatus.OK);
    }
    @PostMapping("/")
    public void add(@RequestBody ItemDescripcion itemDescripcion) {
        try {
            service.save(itemDescripcion);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
