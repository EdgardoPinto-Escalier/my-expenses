package com.example.codeengine.expenses.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="expenses")
public class Expenses {

    @Id
    private Long id;

    private Instant expensedate;
    private String description;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;
}
