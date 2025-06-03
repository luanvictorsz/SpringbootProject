package com.aeternus.food.food.Repository;

import com.aeternus.food.food.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

//o Repository não é uma classe, é uma interface!!
public interface FoodRepository extends JpaRepository<Food, Long> {

}
