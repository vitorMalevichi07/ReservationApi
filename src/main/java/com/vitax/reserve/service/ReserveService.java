package com.vitax.reserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitax.reserve.model.Reserve;
import com.vitax.reserve.repository.ReserveRepository;

@Service
public class ReserveService {

    @Autowired
    private ReserveRepository reserveRepository;

    public List<Reserve> getReserves() {
        return reserveRepository.findAll();
    }

   public Reserve getReserveById(Long id) {
        return reserveRepository.findById(id)
            .orElse(null);
    }

    public List<Reserve> addReserve(Reserve reserve) {
        reserveRepository.save(reserve);
        return getReserves();
    }

    public List<Reserve> deleteReserve(Long id) {
        reserveRepository.deleteById(id);
        return getReserves();
    }
}
