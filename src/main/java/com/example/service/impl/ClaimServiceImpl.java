package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Claim;
import com.example.repository.ClaimRepository;
import com.example.service.ClaimService;

public class ClaimServiceImpl implements ClaimService{

	@Autowired
    private ClaimRepository claimRepository;

    @Override
    public Claim saveClaim(Claim claim) {
        return claimRepository.save(claim);
    }
}
