package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ITipoItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.service.TipoItemPerfilEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/tipoitemperfilentrada")
public class TipoItemPerfilEntradaController {
    @Autowired
    private TipoItemPerfilEntradaService service;

    @GetMapping("/")
    public List<ITipoItemPerfilEntrada> list() {
        return service.listAll();
    }
}
