package br.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
  
}
