package by.alishev.lessons.lesson33_34_generics.part2;

public class Animal {
    private int id;

    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal eat ......");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
