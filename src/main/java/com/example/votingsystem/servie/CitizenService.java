package com.example.votingsystem.servie;

import com.example.votingsystem.dao.CitizensRepository;
import com.example.votingsystem.dao.VotesRepository;
import com.example.votingsystem.model.AddVoteModel;
import com.example.votingsystem.model.Candidate;
import com.example.votingsystem.model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CitizenService {
    private final VotesRepository votesRepository;
    private final CitizensRepository citizensRepository;

    @Autowired
    public CitizenService(VotesRepository votesRepository, CitizensRepository citizensRepository) {
        this.votesRepository = votesRepository;
        this.citizensRepository = citizensRepository;
    }

    public void addVote(AddVoteModel avm) {
        Candidate candidate = votesRepository.getOne(avm.getCandidateId());
        Citizen citizen = citizensRepository.getOne(avm.getVoterId());


        if (citizen == null) return;
        if (candidate == null) return;

        System.out.println(candidate.getName());
        System.out.println(citizen.getName());

        candidate.addVote();
        citizen.disableVote();
    }

    public void addCitizen(Citizen citizen) {
        citizensRepository.save(citizen);
    }
}
