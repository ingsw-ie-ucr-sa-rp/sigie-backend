package cr.ac.ucr.ie.sigie.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class PlanEstudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlanEstudio;
    @Column(name = "anoAprobacion", unique = false, nullable = false)
    private int anoAprobacion;
    @Column(name = "cantidadCiclos", unique = false, nullable = false)
    private int cantidadCiclos;
    @Column(name = "codigoCarrera", unique = false, nullable = false)
    private int codigoCarrera;
    @Column(name = "duracionAnos", unique = false, nullable = false)
    private int duracionAnos;
    @Column(name = "nombreCarrera", unique = false, length = 256, nullable = false)
    private String nombreCarrera;
    @Column(name = "imagenesRelacionadas", unique = false, nullable = false)
    private byte imagenesRelacionadas;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "planEstudio", orphanRemoval = true)
    @JsonIgnoreProperties("planEstudio")
    private List<Curso> cursos;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "planEstudio", orphanRemoval = true)
    @JsonIgnoreProperties("planEstudio")
    private List<Enfasis> enfasis;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<UnidadAcademica> unidadesAcademicasPropietarias;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "planEstudio", orphanRemoval = true)
    private List<ItemPerfilEntrada> itemesPerfilEntrada;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "planEstudio", orphanRemoval = true)
    private List<ItemPerfilSalida> itemesPerfilSalida;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idGrado")
    @JsonIgnoreProperties("planesEstudio")
    private Grado grado;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "planEstudio", orphanRemoval = true)
    @JsonIgnoreProperties("planEstudio")
    private List<DescripcionPlanEstudio> descripcionesPlanEstudio;

    public PlanEstudio() {
        setCursos(new ArrayList<>());
        setEnfasis(new ArrayList<>());
        setUnidadesAcademicasPropietarias(new ArrayList<>());
        setItemesPerfilEntrada(new ArrayList<>());
        setItemesPerfilSalida(new ArrayList<>());
        setGrado(new Grado());
        setDescripcionesPlanEstudio(new ArrayList<>());
    }

    public int getIdPlanEstudio() {
        return idPlanEstudio;
    }

    public void setIdPlanEstudio(int idPlanEstudio) {
        this.idPlanEstudio = idPlanEstudio;
    }

    public int getAnoAprobacion() {
        return anoAprobacion;
    }

    public void setAnoAprobacion(int anoAprobacion) {
        this.anoAprobacion = anoAprobacion;
    }

    public int getCantidadCiclos() {
        return cantidadCiclos;
    }

    public void setCantidadCiclos(int cantidadCiclos) {
        this.cantidadCiclos = cantidadCiclos;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getDuracionAnos() {
        return duracionAnos;
    }

    public void setDuracionAnos(int duracionAnos) {
        this.duracionAnos = duracionAnos;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public byte getImagenesRelacionadas() {
        return imagenesRelacionadas;
    }

    public void setImagenesRelacionadas(byte imagenesRelacionadas) {
        this.imagenesRelacionadas = imagenesRelacionadas;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Enfasis> getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(List<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }

    public List<UnidadAcademica> getUnidadesAcademicasPropietarias() {
        return unidadesAcademicasPropietarias;
    }

    public void setUnidadesAcademicasPropietarias(List<UnidadAcademica> unidadesAcademicasPropietarias) {
        this.unidadesAcademicasPropietarias = unidadesAcademicasPropietarias;
    }

    public List<ItemPerfilEntrada> getItemesPerfilEntrada() {
        return itemesPerfilEntrada;
    }

    public void setItemesPerfilEntrada(List<ItemPerfilEntrada> itemesPerfilEntrada) {
        this.itemesPerfilEntrada = itemesPerfilEntrada;
    }

    public List<ItemPerfilSalida> getItemesPerfilSalida() {
        return itemesPerfilSalida;
    }

    public void setItemesPerfilSalida(List<ItemPerfilSalida> itemesPerfilSalida) {
        this.itemesPerfilSalida = itemesPerfilSalida;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public List<DescripcionPlanEstudio> getDescripcionesPlanEstudio() {
        return descripcionesPlanEstudio;
    }

    public void setDescripcionesPlanEstudio(List<DescripcionPlanEstudio> descripcionesPlanEstudio) {
        this.descripcionesPlanEstudio = descripcionesPlanEstudio;
    }
}
