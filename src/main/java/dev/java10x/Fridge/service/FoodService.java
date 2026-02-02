package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//Identifica como um service (service = regras de negocios)

@Service
public class FoodService {

    //Pego todos os metodos do JPA
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //Listar
    public List<Food> getAll() {return foodRepository.findAll();}

    //Criar
    public Food save(Food food) {return foodRepository.save(food);}

    //DELETE
    public void delete(Long id) {foodRepository.deleteById(id);}




}
