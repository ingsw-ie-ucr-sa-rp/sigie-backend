package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="enfasis")
public class Enfasis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enfasis", nullable = false)
    private int idEnfasis;

    @Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;

    @ManyToOne(targetEntity = PlanEstudio.class, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_plan_estudio", referencedColumnName = "id_plan_estudio", nullable = false, insertable = false, updatable = false)
    private PlanEstudio planEstudio;

    @ManyToMany(targetEntity = Curso.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "curso_enfasis", joinColumns = @JoinColumn(name = "id_enfasis", referencedColumnName = "id_enfasis"), inverseJoinColumns = @JoinColumn(name = "id_curso", referencedColumnName = "id_curso"))
    private List<Curso> cursos;

    public Enfasis(int idEnfasis, String descripcion, PlanEstudio planEstudio, List<Curso> cursos) {
        this.idEnfasis = idEnfasis;
        this.descripcion = descripcion;
        this.planEstudio = planEstudio;
        this.cursos = new ArrayList<Curso>();
    }

    public Enfasis() {
        this.idEnfasis = 0;
        this.descripcion = "";
        this.planEstudio = new PlanEstudio();
        this.cursos = new ArrayList<Curso>();
    }

    public int getIdEnfasis() {
        return idEnfasis;
    }

    public void setIdEnfasis(int idEnfasis) {
        this.idEnfasis = idEnfasis;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}