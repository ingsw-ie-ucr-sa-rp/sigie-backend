package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.TipoPerfilEntrada;
import cr.ac.ucr.ie.sigie.service.TipoPerfilEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/tipoPerfilEntrada")
public class TipoPerfilEntradaController {
    @Autowired
    private TipoPerfilEntradaService tipoPerfilEntradaService;

    @GetMapping("/list")
    public List<TipoPerfilEntrada> list() {
        return tipoPerfilEntradaService.listAll();
    }
}