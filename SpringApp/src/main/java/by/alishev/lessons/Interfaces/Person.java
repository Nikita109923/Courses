package by.alishev.lessons.Interfaces;

public class Person implements IInfo{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInto() {
        System.out.println("Name is : " + this.name);
    }
}
