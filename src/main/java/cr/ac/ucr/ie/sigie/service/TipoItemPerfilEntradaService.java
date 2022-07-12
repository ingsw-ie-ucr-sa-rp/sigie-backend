package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ITipoItemPerfilEntrada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.TipoItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.repository.TipoItemPerfilEntradaRepository;
import java.util.List;

@Service
@Transactional
public class TipoItemPerfilEntradaService {

    @Autowired
    private TipoItemPerfilEntradaRepository repository;

    public List<ITipoItemPerfilEntrada> listAll() {
        return repository.findAllBy();
    }

    public void save(TipoItemPerfilEntrada tipoPerfilEntrada) {
        repository.save(tipoPerfilEntrada);
    }

    public TipoItemPerfilEntrada get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
