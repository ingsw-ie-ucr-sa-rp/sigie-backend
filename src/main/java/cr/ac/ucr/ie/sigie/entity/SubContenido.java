package cr.ac.ucr.ie.sigie.entity;

import javax.persistence.*;

@Entity
public class SubContenido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubContenido;
    @Column(name = "subTema", unique = false, length = 256, nullable = false)
    private String subTema;
    @Column(name = "ordenSubContenido", unique = false, nullable = false)
    private int ordenSubContenido;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idContenido")
    private Contenido contenido;

    public SubContenido() {
        contenido = new Contenido();
    }

    public int getIdSubContenido() {
        return idSubContenido;
    }

    public void setIdSubContenido(int idSubContenido) {
        this.idSubContenido = idSubContenido;
    }

    public String getSubTema() {
        return subTema;
    }

    public void setSubTema(String subTema) {
        this.subTema = subTema;
    }

    public int getOrdenSubContenido() {
        return ordenSubContenido;
    }

    public void setOrdenSubContenido(int ordenSubContenido) {
        this.ordenSubContenido = ordenSubContenido;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
}
