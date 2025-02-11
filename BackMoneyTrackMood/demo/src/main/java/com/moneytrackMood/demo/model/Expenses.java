package com.moneytrackMood.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expenses {
    @Id
    private Long id;
    private String category;
    private Double amount;
    private String mood;
    private LocalDate date;

}
