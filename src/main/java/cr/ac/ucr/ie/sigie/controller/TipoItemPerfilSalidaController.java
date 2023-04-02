package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ITipoItemPerfilSalida;
import cr.ac.ucr.ie.sigie.service.TipoItemPerfilSalidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/tipoitemperfilsalida")
@Tag(name = "Tipos de Items Perfil de Salida", description = "Endpoints para gestionar tipos de items de perfil de salida.")
public class TipoItemPerfilSalidaController {
    @Autowired
    private TipoItemPerfilSalidaService service;

    @GetMapping("/")
    @Operation(description = "Obtener lista de tipos de items de perfil de salida.")
    public List<ITipoItemPerfilSalida> list() {
        return service.listAll();
    }
}
