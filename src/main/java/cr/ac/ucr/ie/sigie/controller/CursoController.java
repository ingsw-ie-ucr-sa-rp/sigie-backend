package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.dto.get.EnfasisGetDTO;
import cr.ac.ucr.ie.sigie.dto.get.RequisitosGetDTO;
import cr.ac.ucr.ie.sigie.dto.post.*;
import cr.ac.ucr.ie.sigie.entity.*;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IBloqueElectivos;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICurso;
import cr.ac.ucr.ie.sigie.service.BloqueElectivosService;
import cr.ac.ucr.ie.sigie.service.CursoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/curso")
public class CursoController {

    public void setService(CursoService service) {
        this.service = service;
    }

    @Autowired
    private CursoService service;

    @Autowired
    private BloqueElectivosService bloqueElectivosService;

    @GetMapping("/obtenertodos")
    public ResponseEntity<List<ICurso>> list() {
        List<ICurso> cursos = service.getCursos();
        return new ResponseEntity<List<ICurso>>(cursos, HttpStatus.OK);
    }

    @GetMapping("/obtenerbloquespadrespornombre")
    public ResponseEntity<List<ICurso>> getPadresPorNombre(@RequestParam String nombre) {
        List<ICurso> cursos = service.getCursosPadrePorNombre(nombre);
        return new ResponseEntity<List<ICurso>>(cursos, HttpStatus.OK);
    }

    @GetMapping("/obtenerbloquespadres")
    public ResponseEntity<List<ICurso>> getPadres() {
        List<ICurso> cursos = service.getCursosBloquesElectivos();
        return new ResponseEntity<List<ICurso>>(cursos, HttpStatus.OK);
    }

    @GetMapping("/obtenercursospornombre")
    public ResponseEntity<List<ICurso>> getCursosPorNombre(@RequestParam String nombre) {
        List<ICurso> cursos = service.getCursosPorNombre(nombre);
        return new ResponseEntity<List<ICurso>>(cursos, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity add(@RequestBody CursoPostDTO cursoDTO) {

        Curso curso = new Curso();
        ModelMapper modelMapper = new ModelMapper();

        AreaDisciplinaria areaDisciplinaria = new AreaDisciplinaria();
        if(cursoDTO.getAreaDisciplinaria().getId_area_disciplinaria() != 0){
           areaDisciplinaria.setIdAreaDisciplinaria(cursoDTO.getAreaDisciplinaria().getId_area_disciplinaria());
           areaDisciplinaria.setNombre(cursoDTO.getAreaDisciplinaria().getNombre());
        }else{
           areaDisciplinaria = null;
        }

        Modalidad modalidad = new Modalidad();
        modalidad.setIdModalidad(cursoDTO.getModalidad().getIdModalidad());


        BloqueElectivos bloqueElectivos = new BloqueElectivos();

        if(cursoDTO.getBloquesElectivos().getIdBloqueElectivo() != 0){
            bloqueElectivos.setIdBloqueElectivo(cursoDTO.getBloquesElectivos().getIdBloqueElectivo());
        }else{
            bloqueElectivos =null;
        }

        if (bloqueElectivos !=null && bloqueElectivosExist(bloqueElectivos) == false) {
            List<Curso> cursos = new ArrayList<>();
            cursos.add(curso);
            bloqueElectivos.setCursosPertenecientes(cursos);
            bloqueElectivosService.save(bloqueElectivos);
        }


        PlanEstudio planEstudio = new PlanEstudio();
        planEstudio.setIdPlanEstudio(cursoDTO.getPlanEstudio().getIdPlanEstudio());


        List<Contenido> contenidos = new ArrayList<>();
        for (ContenidosPostDTO contenido : cursoDTO.getContenidos()) {
            Contenido obj = new Contenido();
            obj.setTema(contenido.getTema());
            obj.setOrdenContenido(contenido.getOrden());
            contenidos.add(obj);
        }

        List<UnidadAcademica> unidadesAcademicas = new ArrayList<>();
        for (UnidadesAcademicasPostDTO unidad : cursoDTO.getUnidadesAcademicas()) {
            UnidadAcademica obj = new UnidadAcademica();
            obj.setNombreUnidadAcademica(unidad.getNombre_unidad_academica());
            unidadesAcademicas.add(obj);
        }

        List<Curso> correquisitos = new ArrayList<>();
        for (CorrequisitosPostDTO correquisito : cursoDTO.getCorrequisitos()) {
            Curso obj = new Curso();
            obj.setIdCurso(correquisito.getIdCorrequisito());
            correquisitos.add(obj);
        }

        List<Curso> requisitos = new ArrayList<>();
        for (RequisitosPostDTO requisito : cursoDTO.getRequisitos()) {
            Curso obj = new Curso();
            obj.setIdCurso(requisito.getIdRequisito());
            requisitos.add(obj);
        }

        List<Enfasis> enfasis = new ArrayList<>();
        for (EnfasisPostDTO enfasi : cursoDTO.getEnfasis()) {
            Enfasis obj = new Enfasis();
            obj.setDescripcion(enfasi.getEnfasis());
            obj.setPlanEstudio(planEstudio);
            enfasis.add(obj);
        }

        List<ReferenciaBibliografica> referencias = new ArrayList<>();
        for (ReferenciasPostDTO referencia : cursoDTO.getReferencias()) {
            ReferenciaBibliografica obj = new ReferenciaBibliografica();
            obj.setReferencia(referencia.getReferencia());
            referencias.add(obj);
        }

        List<ItemDescripcion> itemDescripciones = new ArrayList<>();
        for (ItemDescripcionPostDTO item : cursoDTO.getItemDescripciones()) {
            ItemDescripcion obj = new ItemDescripcion();
            obj.setDetalleDescripcion(item.getDetalleDescripcion());
            obj.setOrdenDescripcion(item.getOrdenDescripcion());
            itemDescripciones.add(obj);
        }

        List<ResultadosAprendizaje> resultadosAprendizajes = new ArrayList<>();
        for (ResultadoAprendizajePostDTO resultado : cursoDTO.getResultadoAprendizajes()) {
            ResultadosAprendizaje obj = new ResultadosAprendizaje();
            obj.setSentenciaResultado(resultado.getSentenciaResultado());
            resultadosAprendizajes.add(obj);
        }


        curso.setNombre(cursoDTO.getNombre());
        curso.setCreditos(cursoDTO.getCreditos());
        curso.setCiclo(cursoDTO.getCiclo());
        curso.setElectivo(cursoDTO.isElectivo());
        curso.setPadre(cursoDTO.isPadre());
        curso.setHorasPractica(cursoDTO.getHorasPractica());
        curso.setHorasTeoricoPractica(cursoDTO.getHorasTeoricoPractica());
        curso.setHorasLaboratorio(cursoDTO.getHorasLaboratorio());
        curso.setSigla(cursoDTO.getSigla());
        curso.setObjetivoGeneral(cursoDTO.getObjetivoGeneral());
        curso.setHorasTeoria(cursoDTO.getHorasTeoria());
        curso.setAreaDisciplinaria(areaDisciplinaria);
        curso.setModalidad(modalidad);
        curso.setContenidos(contenidos);
        curso.setRequisitos(requisitos);
        curso.setReferenciasBibliograficas(referencias);
        curso.setCorrequisitos(correquisitos);
        curso.setUnidadesAcademicasPropietarias(unidadesAcademicas);
        curso.setItemesDescripcion(itemDescripciones);
        curso.setResultadosDeAprendizaje(resultadosAprendizajes);
        curso.setEnfasis(enfasis);
        curso.setBloquesElectivos(bloqueElectivos);
        curso.setPlanEstudio(planEstudio);



        if (cursoExist(curso) == false) {
            try {
                service.save(curso);
                return new ResponseEntity(HttpStatus.OK);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    public boolean cursoExist(Curso curso){
        List<ICurso> cursos = service.getCursos();
        boolean cursoExist = false;
        for (int i = 0; i<cursos.size();i++){
            if(cursos.get(i).getSigla().equals(curso.getSigla())||cursos.get(i).getNombre().equals(curso.getNombre())){
                return cursoExist = true;
            }
        }
        return cursoExist;
    }


    public boolean bloqueElectivosExist(BloqueElectivos bloqueElectivos){
        List<IBloqueElectivos> bloquesElectivos = bloqueElectivosService.getBloqueElectivos();
        boolean bloqueExist = false;
        for (int i = 0; i<bloquesElectivos.size();i++){
            if(bloquesElectivos.get(i).getIdBloqueElectivo() == bloqueElectivos.getIdBloqueElectivo()){
                return bloqueExist = true;
            }
        }
        return bloqueExist;
    }

}
