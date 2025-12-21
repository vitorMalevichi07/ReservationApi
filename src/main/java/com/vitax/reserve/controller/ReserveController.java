package com.vitax.reserve.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitax.reserve.model.Reserve;
import com.vitax.reserve.service.ReserveService;

@RestController
@RequestMapping("/reserve")
public class ReserveController {

    private final ReserveService reserveService;

    public ReserveController(ReserveService reserveService) {
        this.reserveService = reserveService;
    }

    @GetMapping
    public List<Reserve> getReserves() {
        return reserveService.getReserves();
    }

    @GetMapping("/{id}")
    public Reserve getReserveById(@PathVariable Long id) {
        return reserveService.getReserveById(id);
    }

    @PostMapping
    public List<Reserve> addReserve(@RequestBody Reserve reserve) {
        return reserveService.addReserve(reserve);
    }

    @DeleteMapping("/{id}")
    public List<Reserve> deleteReserve(@PathVariable Long id) {
        return reserveService.deleteReserve(id);
    }
}
