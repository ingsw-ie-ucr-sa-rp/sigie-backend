package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="plan_estudio")
public class PlanEstudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_plan_estudio")
    private int idPlanEstudio;

    @Column(name="anno_aprobacion")
    private int annoAprobacion;

    @Column(name="cantidad_ciclos", nullable = false)
    private int cantidadCiclos;

    @Column(name="codigo_carrera", unique = true, length = 6, nullable = false)
    private String codigoCarrera;

    @Column(name="duracion_annos", nullable = false)
    private int duracionAnnos;

    @Column(name="nombre_carrera", length = 50, nullable = false)
    private String nombreCarrera;

    @OneToMany(targetEntity = ItemPerfilEntrada.class,fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_plan_estudio", referencedColumnName = "id_plan_estudio",nullable = false)
    private List<ItemPerfilEntrada> itemesPerfilEntrada;

    @OneToMany(targetEntity = ItemPerfilSalida.class,fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_plan_estudio", referencedColumnName = "id_plan_estudio",nullable = false)
    private List<ItemPerfilSalida> itemesPerfilSalida;


    @ManyToMany(targetEntity = UnidadAcademica.class,fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_unidad_academica", referencedColumnName = "id_unidad_academica",nullable = false)
    private List<UnidadAcademica> unidadesAcademicasPropetiaras;

    @OneToMany(targetEntity = Enfasis.class,fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_plan_estudio", referencedColumnName = "id_plan_estudio",nullable = false)
    private List<Enfasis> enfasis;

    public PlanEstudio(int idPlanEstudio, int annoAprobacion, int cantidadCiclos, String codigoCarrera,
                       int duracionAnnos, String nombreCarrera, List<ItemPerfilEntrada> itemesPerfilEntrada,
                       List<ItemPerfilSalida> itemesPerfilSalida,
                       List<UnidadAcademica> unidadesAcademicasPropetiaras, List<Enfasis> enfasis) {
        this.idPlanEstudio = idPlanEstudio;
        this.annoAprobacion = annoAprobacion;
        this.cantidadCiclos = cantidadCiclos;
        this.codigoCarrera = codigoCarrera;
        this.duracionAnnos = duracionAnnos;
        this.nombreCarrera = nombreCarrera;
        this.itemesPerfilEntrada = new ArrayList<ItemPerfilEntrada>();
        this.itemesPerfilSalida = new ArrayList<ItemPerfilSalida>();
        this.unidadesAcademicasPropetiaras = new ArrayList<UnidadAcademica>();
        this.enfasis = new ArrayList<Enfasis>();
    }

    public PlanEstudio(){
    }

    public int getIdPlanEstudio() {
        return idPlanEstudio;
    }

    public void setIdPlanEstudio(int idPlanEstudio) {
        this.idPlanEstudio = idPlanEstudio;
    }

    public int getAnnoAprobacion() {
        return annoAprobacion;
    }

    public void setAnnoAprobacion(int annoAprobacion) {
        this.annoAprobacion = annoAprobacion;
    }

    public int getCantidadCiclos() {
        return cantidadCiclos;
    }

    public void setCantidadCiclos(int cantidadCiclos) {
        this.cantidadCiclos = cantidadCiclos;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getDuracionAnnos() {
        return duracionAnnos;
    }

    public void setDuracionAnnos(int duracionAnnos) {
        this.duracionAnnos = duracionAnnos;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
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

    public List<UnidadAcademica> getUnidadesAcademicasPropetiaras() {
        return unidadesAcademicasPropetiaras;
    }

    public void setUnidadesAcademicasPropetiaras(List<UnidadAcademica> unidadesAcademicasPropetiaras) {
        this.unidadesAcademicasPropetiaras = unidadesAcademicasPropetiaras;
    }

    public List<Enfasis> getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(List<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + idPlanEstudio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PlanEstudio other = (PlanEstudio) obj;
        if (idPlanEstudio != other.idPlanEstudio)
            return false;
        return true;
    }
}
