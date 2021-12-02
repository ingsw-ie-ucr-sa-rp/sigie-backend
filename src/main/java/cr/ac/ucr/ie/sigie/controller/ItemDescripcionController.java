package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.ItemDescripcion;
import cr.ac.ucr.ie.sigie.service.ItemDescripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/item")
public class ItemDescripcionController {
    @Autowired
    private ItemDescripcionService service;

    @GetMapping("/items")
    public List<ItemDescripcion> list() {return service.listAll();
    }
}
