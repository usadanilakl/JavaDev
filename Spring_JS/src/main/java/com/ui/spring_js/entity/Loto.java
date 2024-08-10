package com.ui.spring_js.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
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
