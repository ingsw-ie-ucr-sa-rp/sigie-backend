package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="modalidad")
public class Modalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modalidad", nullable = false)
    private int idModalidad;

    @Column(name = "tipo_modalidad", length = 30, nullable = false)
    private String tipoModalidad;

    @OneToMany(targetEntity = Curso.class, fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_modalidad", referencedColumnName = "id_modalidad", nullable = true)
    private List<Curso> cursos;

    public Modalidad(int idModalidad, String tipoModalidad, List<Curso> cursos) {
        this.idModalidad = idModalidad;
        this.tipoModalidad = tipoModalidad;
        this.cursos = new ArrayList<Curso>();
    }

    public Modalidad() {
        this.idModalidad = 0;
        this.tipoModalidad = "";
        this.cursos = new ArrayList<Curso>();
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