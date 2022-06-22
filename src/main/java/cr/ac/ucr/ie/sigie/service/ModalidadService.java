package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IModalidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.Modalidad;
import cr.ac.ucr.ie.sigie.repository.ModalidadRepository;
import java.util.List;

@Service
@Transactional
public class ModalidadService {

    @Autowired
    private ModalidadRepository repository;

    public List<Modalidad> listAll() {
        return repository.findAll();
    }

    public List<IModalidad> getModalidades(){
        return repository.findAllBy();
    }

    public void save(Modalidad modalidad) {
        repository.save(modalidad);
    }

    public Modalidad get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
