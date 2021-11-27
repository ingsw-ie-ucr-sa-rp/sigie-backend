package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContenido;

    @Column(name = "tema", unique = false, length = 256, nullable = false)
    private String tema;

    @Column(name = "ordenContenido", unique = false, nullable = false)
    private int ordenContenido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCurso")
    private Curso curso;


    public Contenido() {
        curso = new Curso();
    }

    public int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getOrdenContenido() {
        return ordenContenido;
    }

    public void setOrdenContenido(int ordenContenido) {
        this.ordenContenido = ordenContenido;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
