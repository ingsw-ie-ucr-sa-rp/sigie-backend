package com.course.sigiebackend.controller;


import com.course.sigiebackend.entity.Curso;
import com.course.sigiebackend.service.CursoService;
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
@RequestMapping(path = "/api/cursos")
public class CursoController {

    @Autowired
    private CursoService service;

    @GetMapping("/list")
    public @ResponseBody List<Curso> list() {
        //¿reglas de negocio?
        //if...es admin
        return service.listAll();
    }

    @GetMapping("/get/{id}")
    public @ResponseBody ResponseEntity<Curso> get(@PathVariable Integer id) {
        try {
            Curso curso = service.get(id);
            return new ResponseEntity<Curso>(curso, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Curso>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public @ResponseBody void add(@RequestBody String cursoJson) {

        //reglas de negocio??

        ObjectMapper objectMapper;

        try {

            objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper.readTree(cursoJson);

            String name = jsonNode.get("Name").asText();
            String email = jsonNode.get("Email").asText();
            int password = jsonNode.get("Password").asInt();

            Curso curso = new Curso();
            curso.setSigla(name);
            curso.setNombre(email);
            curso.setCreditos(password);

            service.save(curso);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PutMapping("/update")
    public @ResponseBody void update(@RequestBody Curso curso) {
        Curso existingCurso = service.get(curso.getIdCurso());
        service.save(curso);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}