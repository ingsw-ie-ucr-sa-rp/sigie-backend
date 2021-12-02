package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.ItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import cr.ac.ucr.ie.sigie.service.ItemPerfilEntradaService;
import cr.ac.ucr.ie.sigie.service.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/itemPerfilEntrada")
public class ItemPerfilEntradaController {
    @Autowired
    private ItemPerfilEntradaService itemPerfilEntradaService;

    @GetMapping("/list")
    public List<ItemPerfilEntrada> list() {
        return itemPerfilEntradaService.listAll();
    }
}