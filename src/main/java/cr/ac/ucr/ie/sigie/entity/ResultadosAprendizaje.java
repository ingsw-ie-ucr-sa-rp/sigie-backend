package cr.ac.ucr.ie.sigie.entity;

import javax.persistence.*;

@Entity
public class ResultadosAprendizaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResultadoAprendizaje;
    @Column(name = "sentenciaResultado", unique = false, length = 1024, nullable = false)
    private String sentenciaResultado;

    public ResultadosAprendizaje() {
    }

    public int getIdResultadoAprendizaje() {
        return idResultadoAprendizaje;
    }

    public void setIdResultadoAprendizaje(int idResultadoAprendizaje) {
        this.idResultadoAprendizaje = idResultadoAprendizaje;
    }

    public String getSentenciaResultado() {
        return sentenciaResultado;
    }

    public void setSentenciaResultado(String sentenciaResultado) {
        this.sentenciaResultado = sentenciaResultado;
    }
}
