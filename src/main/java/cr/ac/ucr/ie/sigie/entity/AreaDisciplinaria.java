package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="area_disciplinaria")
public class AreaDisciplinaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_area_disciplinaria")
    private int idAreaDisciplinaria;

    @Column(name="nombre", unique = true, length = 50, nullable = false)
    private String nombre;

    @OneToMany(targetEntity = Curso.class,fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_area_disciplinaria", referencedColumnName = "id_area_disciplinaria",nullable = false)
    private List<Curso> cursos;

    public AreaDisciplinaria(int idAreaDisciplinaria, String nombre, List<Curso> cursos) {
        this.idAreaDisciplinaria = idAreaDisciplinaria;
        this.nombre = nombre;
        this.cursos = cursos;
    }

    public AreaDisciplinaria() {
    }

    public int getIdAreaDisciplinaria() {
        return idAreaDisciplinaria;
    }

    public void setIdAreaDisciplinaria(int idAreaDisciplinaria) {
        this.idAreaDisciplinaria = idAreaDisciplinaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime  + idAreaDisciplinaria;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AreaDisciplinaria other = (AreaDisciplinaria) obj;
        if (idAreaDisciplinaria != other.idAreaDisciplinaria)
            return false;
        return true;
    }

}
