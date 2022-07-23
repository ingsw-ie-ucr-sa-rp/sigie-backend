package cr.ac.ucr.ie.sigie.service;


import cr.ac.ucr.ie.sigie.entity.BloqueElectivos;
import cr.ac.ucr.ie.sigie.entity.Contenido;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IBloqueElectivos;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IContenido;
import cr.ac.ucr.ie.sigie.repository.BloqueElectivosRepository;
import cr.ac.ucr.ie.sigie.repository.ContenidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BloqueElectivosService {


    @Autowired
    private BloqueElectivosRepository repository;

    public List<BloqueElectivos> listAll() {
        return repository.findAll();
    }

    public List<IBloqueElectivos> getBloqueElectivos(){
        return repository.findAllBy();
    }

    public void save(BloqueElectivos bloqueElectivos) {
        repository.save(bloqueElectivos);
    }

    public BloqueElectivos get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
