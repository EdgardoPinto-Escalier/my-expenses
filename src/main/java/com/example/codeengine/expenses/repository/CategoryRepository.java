package com.example.codeengine.expenses.repository;

import com.example.codeengine.expenses.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

}
