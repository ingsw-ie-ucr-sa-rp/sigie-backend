package cr.ac.ucr.ie.sigie.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Grado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrado;

    @Column(name = "nombre", unique = false, length = 50, nullable = true)
    private String nombre;

    @Column(name = "totalCreditosMaximo", unique = false, nullable = false)
    private int totalCreditosMaximo;

    @Column(name = "totalCreditosMinimo", unique = false, nullable = false)
    private int totalCreditosMinimo;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "grado", orphanRemoval = true)
    @JsonIgnoreProperties("grado")
    private List<PlanEstudio> planesEstudio;

    public Grado() {
        planesEstudio = new ArrayList<>();
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
}
