package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import cr.ac.ucr.ie.sigie.entity.*;

@Entity
@Table(name="planEstudio")
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

    @ManyToOne(targetEntity = Grado.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional=false)
    @JoinColumn(name = "id_grado", referencedColumnName = "id_grado", nullable = false)
    private Grado grado;

    public PlanEstudio() {
        grado = new Grado();
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

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }
}
