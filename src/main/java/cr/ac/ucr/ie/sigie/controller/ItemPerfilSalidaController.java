package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.DescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.entity.ItemPerfilSalida;
import cr.ac.ucr.ie.sigie.entity.TipoItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemDescripcion;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemPerfilSalida;
import cr.ac.ucr.ie.sigie.service.ItemDescripcionService;
import cr.ac.ucr.ie.sigie.service.ItemPerfilSalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/itemperfilsalida")

public class ItemPerfilSalidaController {
   
    @Autowired
    private ItemPerfilSalidaService service;

    @GetMapping("/")
    public List<IItemPerfilSalida> list() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ItemPerfilSalida get(@PathVariable int id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody ItemPerfilSalida itemPerfilSalida) {
        try {
            service.save(itemPerfilSalida);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
