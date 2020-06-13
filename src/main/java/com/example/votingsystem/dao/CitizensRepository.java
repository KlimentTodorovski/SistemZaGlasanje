package com.example.votingsystem.dao;

import com.example.votingsystem.model.Candidate;
import com.example.votingsystem.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CitizensRepository extends JpaRepository<Citizen, Long> {
    @Query("SELECT a FROM Citizen a")
    Collection<Citizen> findAllCitizens();
}
