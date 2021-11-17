package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.repository.CursoRepository;

import java.util.List;

@Service
@Transactional
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public List<Curso> listAll() {
        return repository.findAll();
    }

    public void save(Curso curso) {
        repository.save(curso);
    }

    public Curso get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
