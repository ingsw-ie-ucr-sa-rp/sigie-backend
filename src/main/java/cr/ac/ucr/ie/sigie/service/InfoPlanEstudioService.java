package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.InfoPlanEstudio;
import cr.ac.ucr.ie.sigie.repository.InfoPlanEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class InfoPlanEstudioService {

    @Autowired
    private InfoPlanEstudioRepository repository;

    public List<InfoPlanEstudio> listAll() {
        return repository.findAll();
    }

    public void save(InfoPlanEstudio infoplanEstudio) {
        repository.save(infoplanEstudio);
    }

    public InfoPlanEstudio get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}
