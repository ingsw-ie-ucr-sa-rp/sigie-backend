package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.TipoItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.entity.TipoItemPerfilSalida;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ITipoItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.service.TipoItemPerfilEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public void add(@RequestBody TipoItemPerfilEntrada tipoItemPerfilEntrada) {
        try {
            service.save(tipoItemPerfilEntrada);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
