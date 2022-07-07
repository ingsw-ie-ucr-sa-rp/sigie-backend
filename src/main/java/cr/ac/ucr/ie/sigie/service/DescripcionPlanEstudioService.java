package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.DescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IDescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.repository.DescripcionPlanEstudioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class DescripcionPlanEstudioService {
    @Autowired
    private DescripcionPlanEstudioRepository repository;

    public List<DescripcionPlanEstudio> listAll() {
        return repository.findAll();
    }

    public List<IDescripcionPlanEstudio> getDescripcionesPlanEstudio(){
        return repository.findAllBy();
    }

    public void save(DescripcionPlanEstudio descripcionPlanEstudio) {
        repository.save(descripcionPlanEstudio);
    }

    public DescripcionPlanEstudio get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
