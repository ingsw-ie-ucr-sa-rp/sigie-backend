package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.TipoPerfilEntrada;
import cr.ac.ucr.ie.sigie.service.TipoPerfilEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/agregarinfoperfilentrada")

public class TipoPerfilEntradaController {

    @Autowired
    private TipoPerfilEntradaService service;

    @PostMapping("/saveTipoPerfilEntrada")
    public void insertTipoPerfilEntrada(@RequestBody TipoPerfilEntrada p) { service.save(p);
    }

    @GetMapping("/perfilesentrada")
    public List<TipoPerfilEntrada> list() {
        return service.listAll();
    }

    @GetMapping("/getTipoPerfilEntradaById/{id}")
    public ResponseEntity<TipoPerfilEntrada> getTipoPerfilEntrada(@PathVariable Integer id) {
        try {
            TipoPerfilEntrada tipoPerfilEntrada = service.get(id);
            return new ResponseEntity<TipoPerfilEntrada>(tipoPerfilEntrada, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<TipoPerfilEntrada>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateTipoPerfilEntrada/{id}")
    public ResponseEntity<TipoPerfilEntrada> update(@RequestBody TipoPerfilEntrada tipoPerfilEntrada, @PathVariable Integer id) {
        try {
            service.save(tipoPerfilEntrada);
            return new ResponseEntity<TipoPerfilEntrada>(tipoPerfilEntrada, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<TipoPerfilEntrada>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteTipoPerfilEntrada/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
