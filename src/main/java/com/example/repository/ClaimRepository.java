package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

}
