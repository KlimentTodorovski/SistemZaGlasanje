package com.example.votingsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddVoteModel {
    private Long voterId;
    private Long candidateId;
}
