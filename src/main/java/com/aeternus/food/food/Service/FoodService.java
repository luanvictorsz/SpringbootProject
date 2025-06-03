package com.aeternus.food.food.Service;

import com.aeternus.food.food.Repository.FoodRepository;
import com.aeternus.food.food.model.Food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAll(){
        return foodRepository.findAll();
    }

    //Listando
    public List<Food> getAllFood(){
        return foodRepository.findAll();
    }

    //Salvando
    public Food save(Food food){
        return foodRepository.save(food);
    }

    //Deletando
    public void delete(Long id){
        foodRepository.deleteById(id);
    }
}
