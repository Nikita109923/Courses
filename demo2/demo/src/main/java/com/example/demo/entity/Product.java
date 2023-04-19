package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
public class Product {
    //На данный момент я использую long, так как это пробная версия и более сложную технологию я еще не освоил.
    //Осознаю,что это не совсем правильно
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dt_create")
    private LocalDateTime dt_create;

    @Column(name = "dt_update")
    private LocalDateTime dt_update;

    @Column(name = "name")
    private String name;

    @Column(name = "calories")
    private double calories;

    @Column(name = "proteins")
    private double proteins;

    @Column(name = "fats")
    private double fats;

    @Column(name = "carbohydrates")
    private double carbohydrates;

    @Column(name = "weight")
    private double weight;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDt_create() {
        return dt_create;
    }

    public void setDt_create(LocalDateTime dt_create) {
        this.dt_create = dt_create;
    }

    public LocalDateTime getDt_update() {
        return dt_update;
    }

    public void setDt_update(LocalDateTime dt_update) {
        this.dt_update = dt_update;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", dt_create=" + dt_create +
                ", dt_update=" + dt_update +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", weight=" + weight +
                '}';
    }
}
