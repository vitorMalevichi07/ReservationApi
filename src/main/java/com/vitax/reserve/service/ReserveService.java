package com.vitax.reserve.service;

import com.vitax.reserve.model.Reserve;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReserveService {

    private List<Reserve> reserves = new ArrayList<>();

    public List<Reserve> getReserves() {
        return reserves;
    }

    public Reserve getReserveById(Long id) {
        return reserves.stream()
                .filter(reserve -> reserve.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addReserve(Reserve reserve) {
        reserves.add(reserve);
    }

    public void deleteReserve(Long id) {
        reserves.removeIf(reserve -> reserve.getId().equals(id));
    }

}
