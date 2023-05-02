package by.alishev.lessons.lesson42_equals;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1.equals(animal2));

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id;
    }
}
