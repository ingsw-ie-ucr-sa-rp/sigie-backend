package cr.ac.ucr.ie.sigie.controller;
import cr.ac.ucr.ie.sigie.entity.Enfasis;
import cr.ac.ucr.ie.sigie.service.EnfasisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/enfasis")
public class EnfasisController {

    @Autowired
    private EnfasisService service;

    @GetMapping("/enfasis")
    public List<Enfasis> list() {
        return service.listAll();
    }

}
