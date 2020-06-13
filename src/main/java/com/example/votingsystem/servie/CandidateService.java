package com.example.votingsystem.servie;

import com.example.votingsystem.dao.VotesRepository;
import com.example.votingsystem.model.Candidate;
import com.example.votingsystem.model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
    private final VotesRepository votesRepository;

    @Autowired
    public CandidateService(VotesRepository votesRepository) {
        this.votesRepository = votesRepository;
    }

    public void addCandidate(Candidate candidate) {
        votesRepository.save(candidate);
    }
}
