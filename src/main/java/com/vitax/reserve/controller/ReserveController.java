package com.vitax.reserve.controller;

import com.vitax.reserve.model.Reserve;
import com.vitax.reserve.service.ReserveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void addReserve(@RequestBody Reserve reserve) {
        reserveService.addReserve(reserve);
    }

    @DeleteMapping("/{id}")
    public void deleteReserve(@PathVariable Long id) {
        reserveService.deleteReserve(id);
    }
}
