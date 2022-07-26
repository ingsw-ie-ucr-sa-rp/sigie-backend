package cr.ac.ucr.ie.sigie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class InfoPlanEstudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombreCarrera", unique = false, nullable = false)
    private String nombreCarrera;

    @Column(name = "añoAprobacion", unique = false, nullable = false)
    private int añoAprobacion;

    @Column(name = "periodicidad", unique = false, nullable = false)
    private String periodicidad;

    @ManyToOne(fetch = FetchType.LAZY)
    private UnidadAcademica unidadesAcademicasPropietarias;

    @Column(name = "modalidad", unique = false, nullable = false)
    private String modalidad;

    @Column(name = "gradoAcademico", unique = false, nullable = false)
    private String gradoAcademico;

    @Column(name = "duracion", unique = false, nullable = false)
    private int duracion;

    @Column(name = "cantidadCiclos", unique = false, nullable = false)
    private int cantidadCiclos;

    @Column(name = "descripcion", unique = false, nullable = false)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    private AreaDisciplinaria areaDisciplinaria;

    @ManyToOne(fetch = FetchType.LAZY)
    private TipoPerfilEntrada tipoPerfilEntrada;

    @ManyToOne(fetch = FetchType.LAZY)
    private TipoPerfilSalida tipoPerfilSalida;

    public InfoPlanEstudio(int id, String nombreCarrera, int añoAprobacion, String periodicidad, UnidadAcademica unidadesAcademicasPropietarias, String modalidad, String gradoAcademico, int duracion, int cantidadCiclos, String descripcion, AreaDisciplinaria areaDisciplinaria, TipoPerfilEntrada tipoPerfilEntrada, TipoPerfilSalida tipoPerfilSalida) {
        this.id = id;
        this.nombreCarrera = nombreCarrera;
        this.añoAprobacion = añoAprobacion;
        this.periodicidad = periodicidad;
        this.unidadesAcademicasPropietarias = unidadesAcademicasPropietarias;
        this.modalidad = modalidad;
        this.gradoAcademico = gradoAcademico;
        this.duracion = duracion;
        this.cantidadCiclos = cantidadCiclos;
        this.descripcion = descripcion;
        this.areaDisciplinaria = areaDisciplinaria;
        this.tipoPerfilEntrada = tipoPerfilEntrada;
        this.tipoPerfilSalida = tipoPerfilSalida;
    }

    public InfoPlanEstudio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getAñoAprobacion() {
        return añoAprobacion;
    }

    public void setAñoAprobacion(int añoAprobacion) {
        this.añoAprobacion = añoAprobacion;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public List<UnidadAcademica> getUnidadesAcademicasPropietarias() {
        return unidadesAcademicasPropietarias;
    }

    public void setUnidadesAcademicasPropietarias(List<UnidadAcademica> unidadesAcademicasPropietarias) {
        this.unidadesAcademicasPropietarias = unidadesAcademicasPropietarias;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadCiclos() {
        return cantidadCiclos;
    }

    public void setCantidadCiclos(int cantidadCiclos) {
        this.cantidadCiclos = cantidadCiclos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<AreaDisciplinaria> getAreaDisciplinaria() {
        return areaDisciplinaria;
    }

    public void setAreaDisciplinaria(List<AreaDisciplinaria> areaDisciplinaria) {
        this.areaDisciplinaria = areaDisciplinaria;
    }

    public List<TipoPerfilEntrada> getTipoPerfilEntrada() {
        return tipoPerfilEntrada;
    }

    public void setTipoPerfilEntrada(List<TipoPerfilEntrada> tipoPerfilEntrada) {
        this.tipoPerfilEntrada = tipoPerfilEntrada;
    }

    public List<TipoPerfilSalida> getTipoPerfilSalida() {
        return tipoPerfilSalida;
    }

    public void setTipoPerfilSalida(List<TipoPerfilSalida> tipoPerfilSalida) {
        this.tipoPerfilSalida = tipoPerfilSalida;
    }
}
