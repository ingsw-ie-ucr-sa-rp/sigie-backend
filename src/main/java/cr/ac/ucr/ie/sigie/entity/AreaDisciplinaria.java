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

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "areaDisciplinaria", orphanRemoval = true)
    private List<Curso> cursos;

    public AreaDisciplinaria() {
        cursos = new ArrayList<>();
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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
