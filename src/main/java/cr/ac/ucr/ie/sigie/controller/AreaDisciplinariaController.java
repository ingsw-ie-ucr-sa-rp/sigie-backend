package com.course.sigiebackend.controller;


import com.course.sigiebackend.entity.AreaDisciplinaria;
import com.course.sigiebackend.entity.Enfasis;
import com.course.sigiebackend.service.AreaDisciplinariaService;
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
@RequestMapping(path = "/api/areadisciplinaria")
public class AreaDisciplinariaController {

    @Autowired
    private AreaDisciplinariaService service;

    @GetMapping("/list")
    public @ResponseBody List<AreaDisciplinaria> list() {
        //¿reglas de negocio?
        //if...es admin
        return service.listAll();
    }

    @GetMapping("/get/{id}")
    public @ResponseBody ResponseEntity<AreaDisciplinaria> get(@PathVariable Integer id) {
        try {
            AreaDisciplinaria areaDisciplinaria = service.get(id);
            return new ResponseEntity<AreaDisciplinaria>(areaDisciplinaria, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<AreaDisciplinaria>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public @ResponseBody void add(@RequestBody String areaDisciplinariaJson) {

        //reglas de negocio??

        ObjectMapper objectMapper;

        try {

            objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper.readTree(areaDisciplinariaJson);

            String nombre = jsonNode.get("Nombre").asText();

            AreaDisciplinaria areaDisciplinaria = new AreaDisciplinaria();
            areaDisciplinaria.setNombre(nombre);

            service.save(areaDisciplinaria);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PutMapping("/update")
    public @ResponseBody void update(@RequestBody AreaDisciplinaria areaDisciplinaria) {
        AreaDisciplinaria existingAreaDisciplinaria= service.get(areaDisciplinaria.getIdAreaDisciplinaria());
        service.save(areaDisciplinaria);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}