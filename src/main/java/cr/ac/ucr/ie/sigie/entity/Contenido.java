package cr.ac.ucr.ie.sigie.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "contenido", orphanRemoval = true)
    private List<SubContenido> subContenidos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCurso")
    @JsonIgnoreProperties("contenidos")
    private Curso curso;


    public Contenido() {
        subContenidos = new ArrayList<>();
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

    public List<SubContenido> getSubContenidos() {
        return subContenidos;
    }

    public void setSubContenidos(List<SubContenido> subContenidos) {
        this.subContenidos = subContenidos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
