package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.ItemPerfilSalida;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemDescripcion;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemPerfilSalida;
import cr.ac.ucr.ie.sigie.service.ItemDescripcionService;
import cr.ac.ucr.ie.sigie.service.ItemPerfilSalidaService;
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
@RequestMapping(path = "/api/itemperfilsalida")

public class ItemPerfilSalidaController {
   
    @Autowired
    private ItemPerfilSalidaService service;

    @GetMapping("/")
    public List<IItemPerfilSalida> list() {
        return service.listAll();
    }
}
