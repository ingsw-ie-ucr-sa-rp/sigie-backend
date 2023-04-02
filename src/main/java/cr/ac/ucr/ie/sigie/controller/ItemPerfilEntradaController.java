package cr.ac.ucr.ie.sigie.controller;


import cr.ac.ucr.ie.sigie.entity.ItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemDescripcion;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.service.ItemDescripcionService;
import cr.ac.ucr.ie.sigie.service.ItemPerfilEntradaService;
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
@RequestMapping(path = "/api/itemperfilentrada")
@Tag(name = "Items Perfil de Entrada", description = "Endpoints para gestionar items de perfil de entrada.")
public class ItemPerfilEntradaController {
    @Autowired
    private ItemPerfilEntradaService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de items de perfil de entrada.")
    public List<IItemPerfilEntrada> list() {
        return service.listAll();
    }
}
