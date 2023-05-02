package by.alishev.lessons.lesson33_34_generics.part1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ///////////////// Java 5 ///////////////
        List animal = new ArrayList();
        Animal ourAnimal = new Animal();
        animal.add("cat");
        animal.add("dog");
        animal.add("frog");
        animal.add(ourAnimal);

        String animals = (String) animal.get(1);
        System.out.println(animals);

        /////////////// After Java 5 ////////////////

        List<String> animal2 = new ArrayList<>();
        animal2.add("cat");
        animal2.add("dog");
        animal2.add("rat");
        String animals2 = animal2.get(2);
        System.out.println(animal2);

    }
}
class Animal{

}
