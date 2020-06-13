package com.example.votingsystem.web;

import com.example.votingsystem.dao.VotesRepository;
import com.example.votingsystem.model.Candidate;
import com.example.votingsystem.servie.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CandidateController {
    private final CandidateService candidateService;
    private final VotesRepository votesRepository;

    @Autowired
    public CandidateController(CandidateService candidateService, VotesRepository votesRepository) {
        this.candidateService = candidateService;
        this.votesRepository = votesRepository;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/addCandidate")
    public void addCandidate(@RequestBody Candidate candidate) {
        candidateService.addCandidate(candidate);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getAllCandidates")
    public String getAllCandidates() {
        return votesRepository.findAllCandidates().toString();
    }
}
