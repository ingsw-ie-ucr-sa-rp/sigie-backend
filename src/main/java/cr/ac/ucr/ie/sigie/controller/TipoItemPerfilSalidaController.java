package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ITipoItemPerfilSalida;
import cr.ac.ucr.ie.sigie.service.TipoItemPerfilSalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/tipoitemperfilsalida")
public class TipoItemPerfilSalidaController {
    @Autowired
    private TipoItemPerfilSalidaService service;

    @GetMapping("/")
    public List<ITipoItemPerfilSalida> list() {
        return service.listAll();
    }
}
