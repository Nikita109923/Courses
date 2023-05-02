package by.alishev.lessons.lesson26_Interfaces;

public class Test {
    public static void main(String[] args) {
        IInfo info1 = new Animal(1);
        IInfo info2 = new Person("Nik");
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bib");
        outputInfo(animal1);
        outputInfo(person1);
            }
    public static void outputInfo(IInfo info){
        info.showInto();
    }

}
