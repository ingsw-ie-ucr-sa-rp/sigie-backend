package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.repository.PlanEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.ReferenciaBibliografica;
import cr.ac.ucr.ie.sigie.repository.ReferenciaBibliograficaRepository;

import java.util.List;

@Service
@Transactional
public class ReferenciaBibliograficaService {

    @Autowired
    private ReferenciaBibliograficaRepository repository;
    ReferenciaBibliograficaService (ReferenciaBibliograficaRepository referenciaBibliograficaRepository) {
        this.repository = referenciaBibliograficaRepository;
    }
    public List<ReferenciaBibliografica> listAll() {
        return repository.findAll();
    }

    public void save(ReferenciaBibliografica referenciaBibliografica) {
        repository.save(referenciaBibliografica);
    }

    public ReferenciaBibliografica get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public boolean existsById(int id){
        return repository.existsById(id);
    }
}
