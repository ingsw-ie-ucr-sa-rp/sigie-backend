package cr.ac.ucr.ie.sigie.entity;

import javax.persistence.*;


@Entity
@Table(name="item_descripcion")
public class ItemDescripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_descripcion")
    private int idDescripcion;

    @Column(name="orden_descripcion")
    private int ordenDescripcion;

    @Column(name="detalle_descripcion", length = 50, nullable = false)
    private String detalleDescripcion;

    @ManyToOne(targetEntity = Curso.class,fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso",nullable = false, insertable = false, updatable = false)
    private Curso curso;

    public ItemDescripcion(int idDescripcion, int ordenDescripcion, String detalleDescripcion, Curso curso) {
        this.idDescripcion = idDescripcion;
        this.ordenDescripcion = ordenDescripcion;
        this.detalleDescripcion = detalleDescripcion;
        this.curso = curso;
    }

    public ItemDescripcion() {
        this.idDescripcion = 0;
        this.ordenDescripcion = 0;
        this.detalleDescripcion = "";
        this.curso = new Curso();
    }

    public int getIdDescripcion() {
        return idDescripcion;
    }

    public void setIdDescripcion(int idDescripcion) {
        this.idDescripcion = idDescripcion;
    }

    public int getOrdenDescripcion() {
        return ordenDescripcion;
    }

    public void setOrdenDescripcion(int ordenDescripcion) {
        this.ordenDescripcion = ordenDescripcion;
    }

    public String getDetalleDescripcion() {
        return detalleDescripcion;
    }

    public void setDetalleDescripcion(String detalleDescripcion) {
        this.detalleDescripcion = detalleDescripcion;
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
        return prime + idDescripcion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemDescripcion other = (ItemDescripcion) obj;
        if (idDescripcion != other.idDescripcion)
            return false;
        return true;
    }

/*public ItemDescription {


    }*/

}// end class