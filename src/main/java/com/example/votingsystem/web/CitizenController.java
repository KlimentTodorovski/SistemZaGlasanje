package com.example.votingsystem.web;

import com.example.votingsystem.dao.CitizensRepository;
import com.example.votingsystem.model.AddVoteModel;
import com.example.votingsystem.model.Citizen;
import com.example.votingsystem.servie.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CitizenController {
    private final CitizenService citizenService;
    private final CitizensRepository citizensRepository;

    @Autowired
    public CitizenController(CitizenService citizenService, CitizensRepository citizensRepository) {
        this.citizenService = citizenService;
        this.citizensRepository = citizensRepository;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/addCitizen")
    public void addCitizen(@RequestBody Citizen citizen) {
        citizenService.addCitizen(citizen);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/addVote")
    public void addCitizen(@RequestBody AddVoteModel avm) {
        citizenService.addVote(avm);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getAllCitizens")
    public String getAllCandidates() {
        return citizensRepository.findAllCitizens().toString();
    }
}
