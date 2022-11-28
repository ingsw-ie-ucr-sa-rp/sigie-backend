package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.DescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.entity.TipoItemPerfilSalida;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ITipoItemPerfilSalida;
import cr.ac.ucr.ie.sigie.service.TipoItemPerfilSalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public void add(@RequestBody TipoItemPerfilSalida tipoItemPerfilSalida) {
        try {
            service.save(tipoItemPerfilSalida);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
