package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
@Table(name="resultados_aprendizaje")
public class ResultadosAprendizaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_resultado_aprendizaje")
    private int idResultadoAprendizaje;

    @Column(name="sentencia_restultado", length = 50, nullable = false)
    private String sentenciaRestultado;

    @ManyToOne(targetEntity = Curso.class,fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso",nullable = false, insertable = false, updatable = false)
    private Curso curso;

    public ResultadosAprendizaje(int idResultadoAprendizaje, String sentenciaRestultado, Curso curso) {
        this.idResultadoAprendizaje = idResultadoAprendizaje;
        this.sentenciaRestultado = sentenciaRestultado;
        this.curso = curso;

    }

    public ResultadosAprendizaje() {
        this.idResultadoAprendizaje = 0;
        this.sentenciaRestultado = "";
        this.curso = new Curso();
    }

    public int getIdResultadoAprendizaje() {
        return idResultadoAprendizaje;
    }

    public void setIdResultadoAprendizaje(int idResultadoAprendizaje) {
        this.idResultadoAprendizaje = idResultadoAprendizaje;
    }

    public String getSentenciaRestultado() {
        return sentenciaRestultado;
    }

    public void setSentenciaRestultado(String sentenciaRestultado) {
        this.sentenciaRestultado = sentenciaRestultado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}