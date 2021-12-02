package cr.ac.ucr.ie.sigie.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;

    @Column(name = "sigla", unique = true, length = 10, nullable = false)
    private String sigla;

    @Column(name = "nombre", unique = false, length = 256, nullable = false)
    private String nombre;

    @Column(name = "creditos", unique = false, nullable = false)
    private int creditos;

    @Column(name = "ciclo", unique = false, length = 256, nullable = false)
    private String ciclo;

    @Column(columnDefinition = "boolean default false")
    private boolean electivo;

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

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Curso> electivos;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Curso> requisitos;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Curso> correquisitos;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "curso", orphanRemoval = true)
    private List<Contenido> contenidos;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "curso", orphanRemoval = true)
    private List<ItemDescripcion> itemesDescripcion;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ReferenciaBibliografica> referenciasBibliograficas;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ResultadosAprendizaje> resultadosDeAprendizaje;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idModalidad")
    private Modalidad modalidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "idAreaDisciplinaria")
    private AreaDisciplinaria areaDisciplinaria;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Enfasis> enfasis;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlanEstudio")
    private PlanEstudio planEstudio;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<UnidadAcademica> unidadesAcademicasPropietarias;


    public Curso() {
        electivos = new ArrayList<>();
        requisitos = new ArrayList<>();
        correquisitos = new ArrayList<>();
        contenidos = new ArrayList<>();
        itemesDescripcion = new ArrayList<>();
        referenciasBibliograficas = new ArrayList<>();
        resultadosDeAprendizaje = new ArrayList<>();
        modalidad = null;
        areaDisciplinaria = null;
        enfasis = new ArrayList<>();
        planEstudio = null;
        unidadesAcademicasPropietarias = new ArrayList<>();
    }

    public int getIdCurso() {
        return idCurso;
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

    @JsonIgnore
    public List<Curso> getElectivos() {
        return electivos;
    }


    public void setElectivos(List<Curso> electivos) {
        this.electivos = electivos;
    }

    public List<Curso> getRequisitos() {
        return requisitos;
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

    @JsonIgnore
    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    @JsonIgnore
    public AreaDisciplinaria getAreaDisciplinaria() {
        return areaDisciplinaria;
    }

    public void setAreaDisciplinaria(AreaDisciplinaria areaDisciplinaria) {
        this.areaDisciplinaria = areaDisciplinaria;
    }


    public List<Enfasis> getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(List<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }

    @JsonIgnore
    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    @JsonIgnore
    public List<UnidadAcademica> getUnidadesAcademicasPropietarias() {
        return unidadesAcademicasPropietarias;
    }

    public void setUnidadesAcademicasPropietarias(List<UnidadAcademica> unidadesAcademicasPropietarias) {
        this.unidadesAcademicasPropietarias = unidadesAcademicasPropietarias;
    }
}
