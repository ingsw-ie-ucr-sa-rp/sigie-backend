package cr.ac.ucr.ie.sigie.entity;

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

    public PlanEstudio() {
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
    
}
