package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ITipoItemPerfilSalida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.TipoItemPerfilSalida;
import cr.ac.ucr.ie.sigie.repository.TipoItemPerfilSalidaRepository;
import java.util.List;

@Service
@Transactional
public class TipoItemPerfilSalidaService {

    @Autowired
    private TipoItemPerfilSalidaRepository repository;

    public List<ITipoItemPerfilSalida> listAll() {
        return repository.findAllBy();
    }

    public void save(TipoItemPerfilSalida tipoPerfilSalida) {
        repository.save(tipoPerfilSalida);
    }

    public TipoItemPerfilSalida get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
