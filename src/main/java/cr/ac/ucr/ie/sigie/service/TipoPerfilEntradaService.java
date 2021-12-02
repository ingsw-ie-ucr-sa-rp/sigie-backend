package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.TipoItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.repository.TipoPerfilEntradaRepository;

import java.util.List;

@Service
@Transactional
public class TipoPerfilEntradaService {

    @Autowired
    private TipoPerfilEntradaRepository repository;

    public List<TipoItemPerfilEntrada> listAll() {
        return repository.findAll();
    }

    public void save(TipoItemPerfilEntrada tipoItemPerfilEntrada) {
        repository.save(tipoItemPerfilEntrada);
    }

    public TipoItemPerfilEntrada get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
