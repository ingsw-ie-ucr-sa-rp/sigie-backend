package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class Enfasis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnfasis;

    @Column(name = "descripcion", unique = false, length = 512, nullable = false)
    private String descripcion;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Curso> cursos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlanEstudio")
    private PlanEstudio planEstudio;

    public Enfasis() {
        cursos = new ArrayList<>();
        planEstudio = new PlanEstudio();
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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }
}
