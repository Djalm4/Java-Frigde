package dev.java10x.Fridge.model;

import jakarta.persistence.*;

import java.time.LocalDate;

//Anotacion
//Fala que essa classe é uma entidade no banco dados
//Cria as colunas(ex: nome, idade, cor do olho)
@Entity
//Table é o nome da tabela
@Table(name = "food_table")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Adiciona o id automaticamente em ordem crescente
    private Long id;
    private String name;
    private LocalDate expetionDate;
    private Integer quantity;

    public Food() {
    }

    public Food(Long id, String name, LocalDate expetionDate, Integer quantity) {
        this.id = id;
        this.name = name;
        this.expetionDate = expetionDate;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpetionDate() {
        return expetionDate;
    }

    public void setExpetionDate(LocalDate expetionDate) {
        this.expetionDate = expetionDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
