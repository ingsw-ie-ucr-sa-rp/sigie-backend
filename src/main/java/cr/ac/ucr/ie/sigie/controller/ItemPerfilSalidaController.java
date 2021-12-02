package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.ItemPerfilSalida;
import cr.ac.ucr.ie.sigie.entity.TipoPerfilSalida;
import cr.ac.ucr.ie.sigie.service.ItemPerfilSalidaService;
import cr.ac.ucr.ie.sigie.service.TipoPerfilSalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/itemPerfilSalida")
public class ItemPerfilSalidaController {
    @Autowired
    private ItemPerfilSalidaService itemPerfilSalidaService;

    @GetMapping("/list")
    public List<ItemPerfilSalida> list() {
        return itemPerfilSalidaService.listAll();
    }
}
