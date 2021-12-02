package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="unidad_academica")
public class UnidadAcademica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_unidad_academica")
    private int idUnidadAcademica;

    @Column(name="nombre_unidad_academica", unique = true, length = 70, nullable = false)
    private String nombreUnidadAcademica;

    @ManyToMany(targetEntity = PlanEstudio.class,fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_plan_estudio", referencedColumnName = "id_plan_estudio",nullable = false)
    private List<PlanEstudio> planesEstudio;

    @ManyToMany(targetEntity = Curso.class,fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso",nullable = false)
    private List<Curso> cursosPropios;

    public UnidadAcademica(int idUnidadAcademica, String nombreUnidadAcademica, List<PlanEstudio> planesEstudio, List<Curso> cursosPropios) {
        this.idUnidadAcademica = idUnidadAcademica;
        this.nombreUnidadAcademica = nombreUnidadAcademica;
        this.planesEstudio = planesEstudio;
        this.cursosPropios = cursosPropios;
    }

    public UnidadAcademica() {
    }

    public int getIdUnidadAcademica() {
        return idUnidadAcademica;
    }

    public void setIdUnidadAcademica(int idUnidadAcademica) {
        this.idUnidadAcademica = idUnidadAcademica;
    }

    public String getNombreUnidadAcademica() {
        return nombreUnidadAcademica;
    }

    public void setNombreUnidadAcademica(String nombreUnidadAcademica) {
        this.nombreUnidadAcademica = nombreUnidadAcademica;
    }

    public List<PlanEstudio> getPlanesEstudio() {
        return planesEstudio;
    }

    public void setPlanesEstudio(List<PlanEstudio> planesEstudio) {
        this.planesEstudio = planesEstudio;
    }

    public List<Curso> getCursosPropios() {
        return cursosPropios;
    }

    public void setCursosPropios(List<Curso> cursosPropios) {
        this.cursosPropios = cursosPropios;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime  + idUnidadAcademica;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UnidadAcademica other = (UnidadAcademica) obj;
        if (idUnidadAcademica != other.idUnidadAcademica)
            return false;
        return true;
    }
}

