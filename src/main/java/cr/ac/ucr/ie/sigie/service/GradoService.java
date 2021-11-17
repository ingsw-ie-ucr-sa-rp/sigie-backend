package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.Grado;
import cr.ac.ucr.ie.sigie.repository.GradoRepository;

import java.util.List;

@Service
@Transactional
public class GradoService {

    @Autowired
    private GradoRepository repository;

    public List<Grado> listAll() {
        return repository.findAll();
    }

    public void save(Grado grado) {
        repository.save(grado);
    }

    public Grado get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
