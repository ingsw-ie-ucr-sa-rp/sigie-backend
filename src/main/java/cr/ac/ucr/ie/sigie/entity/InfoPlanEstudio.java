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

    @Column(name = "anoAprobacion", unique = false, nullable = false)
    private int anoAprobacion;

    @Column(name = "periodicidad", unique = false, nullable = false)
    private String periodicidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unidad_academica")
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
    @JoinColumn(name = "area_disciplinaria")
    private AreaDisciplinaria areaDisciplinaria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_perfil_entrada")
    private TipoPerfilEntrada tipoPerfilEntrada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_perfil_salida")
    private TipoPerfilSalida tipoPerfilSalida;

    public InfoPlanEstudio(int id, String nombreCarrera, int anoAprobacion, String periodicidad, UnidadAcademica unidadesAcademicasPropietarias, String modalidad, String gradoAcademico, int duracion, int cantidadCiclos, String descripcion, AreaDisciplinaria areaDisciplinaria, TipoPerfilEntrada tipoPerfilEntrada, TipoPerfilSalida tipoPerfilSalida) {
        this.id = id;
        this.nombreCarrera = nombreCarrera;
        this.anoAprobacion = anoAprobacion;
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

    public int getAnoAprobacion() {
        return anoAprobacion;
    }

    public void setAnoAprobacion(int anoAprobacion) {
        this.anoAprobacion = anoAprobacion;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public UnidadAcademica getUnidadesAcademicasPropietarias() {
        return unidadesAcademicasPropietarias;
    }

    public void setUnidadesAcademicasPropietarias(UnidadAcademica unidadesAcademicasPropietarias) {
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

    public AreaDisciplinaria getAreaDisciplinaria() {
        return areaDisciplinaria;
    }

    public void setAreaDisciplinaria(AreaDisciplinaria areaDisciplinaria) {
        this.areaDisciplinaria = areaDisciplinaria;
    }

    public TipoPerfilEntrada getTipoPerfilEntrada() {
        return tipoPerfilEntrada;
    }

    public void setTipoPerfilEntrada(TipoPerfilEntrada tipoPerfilEntrada) {
        this.tipoPerfilEntrada = tipoPerfilEntrada;
    }

    public TipoPerfilSalida getTipoPerfilSalida() {
        return tipoPerfilSalida;
    }

    public void setTipoPerfilSalida(TipoPerfilSalida tipoPerfilSalida) {
        this.tipoPerfilSalida = tipoPerfilSalida;
    }
}
