package com.ui.spring_js.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Loto {
    @Id
    @GeneratedValue
    Long id;

    Long number;
    String job;

    public Loto(Long number, String job) {
        this.number = number;
        this.job = job;
    }
}
