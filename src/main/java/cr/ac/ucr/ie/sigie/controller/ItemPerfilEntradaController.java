package cr.ac.ucr.ie.sigie.controller;


import cr.ac.ucr.ie.sigie.entity.DescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.entity.ItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.entity.ItemPerfilSalida;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemDescripcion;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.service.ItemDescripcionService;
import cr.ac.ucr.ie.sigie.service.ItemPerfilEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/itemperfilentrada")

public class ItemPerfilEntradaController {
    @Autowired
    private ItemPerfilEntradaService service;

    @GetMapping("/")
    public List<IItemPerfilEntrada> list() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ItemPerfilEntrada get(@PathVariable int id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody ItemPerfilEntrada itemPerfilEntrada) {
        try {
            service.save(itemPerfilEntrada);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
