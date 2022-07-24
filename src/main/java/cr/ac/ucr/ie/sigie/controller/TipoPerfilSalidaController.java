package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.TipoPerfilSalida;
import cr.ac.ucr.ie.sigie.service.TipoPerfilSalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/agregarinfoperfilsalida")

public class TipoPerfilSalidaController {

    @Autowired
    private TipoPerfilSalidaService service;

    @PostMapping("/saveTipoPerfilSalida")
    public void insertTipoPerfilSalida(@RequestBody TipoPerfilSalida p) { service.save(p);
    }

    @GetMapping("/perfilessalida")
    public List<TipoPerfilSalida> list() {
        return service.listAll();
    }

    @GetMapping("/getTipoPerfilSalidaById/{id}")
    public ResponseEntity<TipoPerfilSalida> getTipoPerfilSalida(@PathVariable Integer id) {
        try {
            TipoPerfilSalida tipoPerfilSalida = service.get(id);
            return new ResponseEntity<TipoPerfilSalida>(tipoPerfilSalida, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<TipoPerfilSalida>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateTipoPerfilSalida/{id}")
    public ResponseEntity<TipoPerfilSalida> update(@RequestBody TipoPerfilSalida tipoPerfilSalida, @PathVariable Integer id) {
        try {
            service.save(tipoPerfilSalida);
            return new ResponseEntity<TipoPerfilSalida>(tipoPerfilSalida, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<TipoPerfilSalida>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteTipoPerfilSalida/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
