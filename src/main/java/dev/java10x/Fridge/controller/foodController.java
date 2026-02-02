package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Identifica a classe como um controller
@RestController
//Mapear as rotas
@RequestMapping("/food")
public class foodController {

    //injeção de dependencia
    private final FoodService foodService;

    public foodController(FoodService foodService) {
        this.foodService = foodService;
    }

    //Listagem de todas as comidas que eu cadastro
    @GetMapping
    public List<Food> getAll(){return foodService.getAll();}

    //Sequisição de enviar informação
    @PostMapping
    //RequestBody vai pedir as informações
    public Food create(@RequestBody Food food) {return foodService.save(food);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {foodService.delete(id);}



}
