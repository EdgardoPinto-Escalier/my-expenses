package com.example.codeengine.expenses.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name="category")
public class Category {

    @Id
    private Long id;
    private String name;
}
