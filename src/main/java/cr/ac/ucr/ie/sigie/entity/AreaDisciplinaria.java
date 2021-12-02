package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="areaDisciplinaria")
public class AreaDisciplinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_area_disciplinaria")
    private int idAreaDisciplinaria;

    @Column(name = "nombreDisciplinaria", unique = false, length = 256, nullable = false)
    private String nombreDisciplinaria;



    public AreaDisciplinaria() {

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
