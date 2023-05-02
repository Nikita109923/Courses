package by.alishev.lessons.lesson35_anonymous_classes;

interface IAnimal {
    public void eat();
}
public class Test {
    public static void main(String[] args) {
        IAnimal animal = new IAnimal() {
            @Override
            public void eat() {
                System.out.println("Someone is eating ...");
            }
        };
    animal.eat();
    }
}
