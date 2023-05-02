package by.alishev.lessons.lesson20_21_24;

public class Lesson20 {
    public static void main(String[] args) {
        Humann human = new Humann("N", 12);
        Humann human2 = new Humann("N", 12);
        human.printNumberOfPeople();
        human2.printNumberOfPeople();
        Humann humann3 = new Humann("Bob",12);
        humann3.printNumberOfPeople();
        human2.printNumberOfPeople();
        human.printNumberOfPeople();

    }
}

class Humann {
    private String name;
    private int age;
    private static int countPeople;
    public Humann(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}

