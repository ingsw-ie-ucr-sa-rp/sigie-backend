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

    @Column(name = "nombre", unique = false, length = 50, nullable = false)
    private String nombre;

    @Column(name = "totalCreditosMaximo", unique = false, nullable = false)
    private int totalCreditosMaximo;

    @Column(name = "totalCreditosMinimo", unique = false, nullable = false)
    private int totalCreditosMinimo;

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

}
