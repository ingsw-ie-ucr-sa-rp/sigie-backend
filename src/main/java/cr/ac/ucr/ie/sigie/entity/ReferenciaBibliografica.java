package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
@Table(name="referencia_bibliografica")
public class ReferenciaBibliografica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_bibliografia")
    private int idBibliografia;

    @Column(name="referencia", length = 50, nullable = false)
    private String referencia;

    @ManyToOne(targetEntity = Curso.class,fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso",nullable = false, insertable = false, updatable = false)
    private Curso curso;

    public ReferenciaBibliografica(int idBibliografia, String referencia, Curso curso) {
        this.idBibliografia = idBibliografia;
        this.referencia = referencia;
        this.curso = curso;
    }

    public ReferenciaBibliografica() {
        this.idBibliografia = 0;
        this.referencia = "";
        this.curso = new Curso();
    }

    public int getIdBibliografia() {
        return idBibliografia;
    }

    public void setIdBibliografia(int idBibliografia) {
        this.idBibliografia = idBibliografia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + idBibliografia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReferenciaBibliografica other = (ReferenciaBibliografica) obj;
        if (idBibliografia != other.idBibliografia)
            return false;
        return true;
    }


}// end claass