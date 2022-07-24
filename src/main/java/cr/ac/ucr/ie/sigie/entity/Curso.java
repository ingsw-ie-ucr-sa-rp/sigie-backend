package cr.ac.ucr.ie.sigie.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import cr.ac.ucr.ie.sigie.dto.get.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.*;


@Entity
@Table(name = "curso")
@NoArgsConstructor
@AllArgsConstructor
public class Curso implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCurso")
    private int idCurso;

    @Column(name = "sigla", unique = true, length = 10, nullable = false)
    private String sigla;

    @Column(name = "nombre", unique = false, length = 256, nullable = false)
    private String nombre;

    @Column(name = "creditos", unique = false, nullable = false)
    private int creditos;

    @Column(name = "ciclo", unique = false, length = 256, nullable = false)
    private String ciclo;

    @Column(columnDefinition = "boolean default false", nullable = false)
    private boolean electivo;

    @Column(columnDefinition = "boolean default false", nullable = false)
    private boolean padre;

    @Column(name = "horasTeoria", unique = false, nullable = false)
    private int horasTeoria;

    @Column(name = "horasPractica", unique = false, nullable = false)
    private int horasPractica;

    @Column(name = "horasLaboratorio", unique = false, nullable = false)
    private int horasLaboratorio;

    @Column(name = "horasTeoricoPractica", unique = false, nullable = false)
    private int horasTeoricoPractica;

    @Column(name = "objetivoGeneral", unique = false, length = 512, nullable = false)
    private String objetivoGeneral;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Curso> requisitos;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Curso> correquisitos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idBloqueElectivo", nullable = true)
    private BloqueElectivos bloquesElectivos;

    @ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Contenido> contenidos;

    @ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    private List<ItemDescripcion> itemesDescripcion;

    @ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    private List<ReferenciaBibliografica> referenciasBibliograficas;

    @ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    private List<ResultadosAprendizaje> resultadosDeAprendizaje;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idModalidad")
    private Modalidad modalidad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idAreaDisciplinaria")
    private AreaDisciplinaria areaDisciplinaria;

    @ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Enfasis> enfasis;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPlanEstudio")
    @JsonIgnoreProperties({"grado", "cursos"})
    private PlanEstudio planEstudio;

    @ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private List<UnidadAcademica> unidadesAcademicasPropietarias;

    public int getIdCurso() {
        return idCurso;
    }

    public boolean isPadre() {
        return padre;
    }

    public void setPadre(boolean padre) {
        this.padre = padre;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public boolean isElectivo() {
        return electivo;
    }

    public void setElectivo(boolean electivo) {
        this.electivo = electivo;
    }

    public int getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(int horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    public int getHorasTeoricoPractica() {
        return horasTeoricoPractica;
    }

    public void setHorasTeoricoPractica(int horasTeoricoPractica) {
        this.horasTeoricoPractica = horasTeoricoPractica;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public List<RequisitosGetDTO> getRequisitos() {
    ModelMapper modelMapper = new ModelMapper();

        List<RequisitosGetDTO> dtos = requisitos
                .stream()
                .map(requisitos -> modelMapper.map(requisitos, RequisitosGetDTO.class))
                .collect(Collectors.toList());

        return dtos;
    }



    public void setRequisitos(List<Curso> requisitos) {
        this.requisitos = requisitos;
    }

    public List<Curso> getCorrequisitos() {
        return correquisitos;
    }

    public void setCorrequisitos(List<Curso> correquisitos) {
        this.correquisitos = correquisitos;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public List<ItemDescripcion> getItemesDescripcion() {
        return itemesDescripcion;
    }

    public void setItemesDescripcion(List<ItemDescripcion> itemesDescripcion) {
        this.itemesDescripcion = itemesDescripcion;
    }

    public List<ReferenciaBibliografica> getReferenciasBibliograficas() {
        return referenciasBibliograficas;
    }

    public void setReferenciasBibliograficas(List<ReferenciaBibliografica> referenciasBibliograficas) {
        this.referenciasBibliograficas = referenciasBibliograficas;
    }

    public List<ResultadosAprendizaje> getResultadosDeAprendizaje() {
        return resultadosDeAprendizaje;
    }

    public void setResultadosDeAprendizaje(List<ResultadosAprendizaje> resultadosDeAprendizaje) {
        this.resultadosDeAprendizaje = resultadosDeAprendizaje;
    }

    public ModalidadGetDTO getModalidad() {
        ModelMapper modelMapper = new ModelMapper();
        ModalidadGetDTO dto = modelMapper.map(modalidad,ModalidadGetDTO.class);
        return dto;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public AreaDisciplinaria getAreaDisciplinaria() {
        return areaDisciplinaria;
    }

    public void setAreaDisciplinaria(AreaDisciplinaria areaDisciplinaria) {
        this.areaDisciplinaria = areaDisciplinaria;
    }

    public List<EnfasisGetDTO> getEnfasis() {
        ModelMapper modelMapper = new ModelMapper();
        List<EnfasisGetDTO> dtos = enfasis
                .stream()
                .map(enfasis -> modelMapper.map(enfasis, EnfasisGetDTO.class))
                .collect(Collectors.toList());
        return dtos;
    }

    public void setEnfasis(List<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public List<UnidadAcademicaGetDTO> getUnidadesAcademicasPropietarias() {
        ModelMapper modelMapper = new ModelMapper();
        List<UnidadAcademicaGetDTO> dtos = unidadesAcademicasPropietarias
                .stream()
                .map(unidadesAcademicasPropietarias -> modelMapper.map(unidadesAcademicasPropietarias, UnidadAcademicaGetDTO.class))
                .collect(Collectors.toList());
        return dtos;
    }

    public void setUnidadesAcademicasPropietarias(List<UnidadAcademica> unidadesAcademicasPropietarias) {
        this.unidadesAcademicasPropietarias = unidadesAcademicasPropietarias;
    }

    public BloqueElectivoGetDTO getBloquesElectivos() {
        try {
            ModelMapper modelMapper = new ModelMapper();
            BloqueElectivoGetDTO dto = modelMapper.map(bloquesElectivos, BloqueElectivoGetDTO.class);
            return dto;
        }catch (Exception e){
            return null;
        }
    }
    public void setBloquesElectivos(BloqueElectivos bloquesElectivos) {
        this.bloquesElectivos = bloquesElectivos;
    }



}