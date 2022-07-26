package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
public class AreaDisciplinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAreaDisciplinaria;

    @Column(name = "nombreDisciplinaria", unique = false, length = 256, nullable = false)
    private String nombreDisciplinaria;


    public AreaDisciplinaria() {
    }

    public AreaDisciplinaria(int idAreaDisciplinaria, String nombreDisciplinaria) {
        this.idAreaDisciplinaria = idAreaDisciplinaria;
        this.nombreDisciplinaria = nombreDisciplinaria;
    }

    public int getIdAreaDisciplinaria() {
        return idAreaDisciplinaria;
    }

    public void setIdAreaDisciplinaria(int idAreaDisciplinaria) {
        this.idAreaDisciplinaria = idAreaDisciplinaria;
    }

    public String getNombreDisciplinaria() {
        return nombreDisciplinaria;
    }

    public void setNombreDisciplinaria(String nombreDisciplinaria) {
        this.nombreDisciplinaria = nombreDisciplinaria;
    }

}
