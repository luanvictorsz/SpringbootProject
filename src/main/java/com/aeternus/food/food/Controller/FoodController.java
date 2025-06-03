package com.aeternus.food.food.Controller;

import com.aeternus.food.food.Service.FoodService;
import com.aeternus.food.food.model.Food;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    //dependence injection
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll(){
        return foodService.getAll();
    }

    @PostMapping
    public Food create(@RequestBody Food food){
        return foodService.save(food);
    }
}
