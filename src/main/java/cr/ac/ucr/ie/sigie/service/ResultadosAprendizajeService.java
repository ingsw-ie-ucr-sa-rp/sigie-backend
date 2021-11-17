package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.ResultadosAprendizaje;
import cr.ac.ucr.ie.sigie.repository.ResultadosAprendizajeRepository;

import java.util.List;

@Service
@Transactional
public class ResultadosAprendizajeService {

    @Autowired
    private ResultadosAprendizajeRepository repository;

    public List<ResultadosAprendizaje> listAll() {
        return repository.findAll();
    }

    public void save(ResultadosAprendizaje resultadosAprendizaje) {
        repository.save(resultadosAprendizaje);
    }

    public ResultadosAprendizaje get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
