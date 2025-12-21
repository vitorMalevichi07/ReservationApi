package com.vitax.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitax.reserve.model.Reserve;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {
    
}
