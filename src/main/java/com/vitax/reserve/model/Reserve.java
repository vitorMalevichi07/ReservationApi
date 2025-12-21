package com.vitax.reserve.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reserves")
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime reserveDate;
    private String customerName;
    private String customerEmail;
    private String tableNumber;

    //Constructors
    public Reserve(Long id, LocalDateTime reserveDate, String customerName, String customerEmail, String tableNumber) {
        this.id = id;
        this.reserveDate = reserveDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.tableNumber = tableNumber;
    }

    public Reserve() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(LocalDateTime reserveDate) {
        this.reserveDate = reserveDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }
}
