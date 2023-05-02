package by.alishev.lessons.lesson25;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("I'm barking");
    }
    public void showName(){
        System.out.println(name);
    }
}
