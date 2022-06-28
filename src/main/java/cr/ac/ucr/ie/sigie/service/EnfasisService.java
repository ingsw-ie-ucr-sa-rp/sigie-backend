package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IEnfasis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.Enfasis;
import cr.ac.ucr.ie.sigie.repository.EnfasisRepository;
import java.util.List;

@Service
@Transactional
public class EnfasisService {

    @Autowired
    private EnfasisRepository repository;

    public List<Enfasis> listAll() {
        return repository.findAll();
    }

    public List<IEnfasis> getEnfasis(){
        return repository.findAllBy();
    }

    public void save(Enfasis enfasis) {
        repository.save(enfasis);
    }

    public Enfasis get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}
