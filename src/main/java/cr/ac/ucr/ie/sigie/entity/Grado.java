package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="grado")
public class Grado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_grado")
    private int idGrado;

    @Column(name="nombre", unique = true, length = 20, nullable = false)
    private String nombre;

    @Column(name="total_creditos_maximo", nullable = false)
    private int totalCreditosMaximo;

    @Column(name="total_creditos_minimo", nullable = false)
    private int totalCreditosMinimo;

    @OneToMany(targetEntity = PlanEstudio.class,fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_grado", referencedColumnName = "id_grado",nullable = true)
    private List<PlanEstudio> planesEstudio;

    public Grado(int idGrado, String nombre, int totalCreditosMaximo, int totalCreditosMinimo, List<PlanEstudio> planesEstudio) {
        this.idGrado = idGrado;
        this.nombre = nombre;
        this.totalCreditosMaximo = totalCreditosMaximo;
        this.totalCreditosMinimo = totalCreditosMinimo;
        this.planesEstudio = new ArrayList<PlanEstudio>();
    }

    public Grado() {
        this.idGrado = 0;
        this.nombre = "";
        this.totalCreditosMaximo = 0;
        this.totalCreditosMinimo = 0;
        this.planesEstudio = new ArrayList<PlanEstudio>();
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalCreditosMaximo() {
        return totalCreditosMaximo;
    }

    public void setTotalCreditosMaximo(int totalCreditosMaximo) {
        this.totalCreditosMaximo = totalCreditosMaximo;
    }

    public int getTotalCreditosMinimo() {
        return totalCreditosMinimo;
    }

    public void setTotalCreditosMinimo(int totalCreditosMinimo) {
        this.totalCreditosMinimo = totalCreditosMinimo;
    }

    public List<PlanEstudio> getPlanesEstudio() {
        return planesEstudio;
    }

    public void setPlanesEstudio(List<PlanEstudio> planesEstudio) {
        this.planesEstudio = planesEstudio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + idGrado;//id de la clase***
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Grado other = (Grado) obj;
        if (idGrado != other.idGrado)//id de la clase***
            return false;
        return true;
    }


}
