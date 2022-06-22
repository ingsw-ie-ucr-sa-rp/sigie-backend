package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Modalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idModalidad;

    @Column(name = "tipoModalidad", unique = false, length = 128, nullable = false)
    private String tipoModalidad;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "modalidad", orphanRemoval = true)
    private List<Curso> cursos;

    public Modalidad() {
        cursos = new ArrayList<>();
    }

    public int getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(int idModalidad) {
        this.idModalidad = idModalidad;
    }

    public String getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(String tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
