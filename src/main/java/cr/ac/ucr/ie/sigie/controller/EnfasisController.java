package com.course.sigiebackend.controller;


import com.course.sigiebackend.entity.Enfasis;
import com.course.sigiebackend.service.EnfasisService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api/enfasis")
public class EnfasisController {

    @Autowired
    private EnfasisService service;

    @GetMapping("/list")
    public @ResponseBody List<Enfasis> list() {
        //¿reglas de negocio?
        //if...es admin
        return service.listAll();
    }

    @GetMapping("/get/{id}")
    public @ResponseBody ResponseEntity<Enfasis> get(@PathVariable Integer id) {
        try {
            Enfasis enfasis = service.get(id);
            return new ResponseEntity<Enfasis>(enfasis, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Enfasis>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public @ResponseBody void add(@RequestBody String enfasisJson) {

        //reglas de negocio??

        ObjectMapper objectMapper;

        try {

            objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper.readTree(enfasisJson);

            String descripcion = jsonNode.get("Descripcion").asText();

            Enfasis enfasis = new Enfasis();
            enfasis.setDescripcion(descripcion);

            service.save(enfasis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PutMapping("/update")
    public @ResponseBody void update(@RequestBody Enfasis enfasis) {
        Enfasis existingEnfasis = service.get(enfasis.getIdEnfasis());
        service.save(enfasis);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}