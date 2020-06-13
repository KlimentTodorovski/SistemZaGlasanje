package com.example.votingsystem.dao;

import com.example.votingsystem.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface VotesRepository extends JpaRepository<Candidate, Long> {
    @Query("SELECT a FROM Candidate a")
    Collection<Candidate> findAllCandidates();
}
