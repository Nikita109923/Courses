package by.alishev.lessons.lesson26_Interfaces;

public class Animal implements IInfo{
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("I'm sleeping");
    }

    @Override
    public void showInto() {
        System.out.println("Id is : " + this.id);
    }

    public static void main(String[] args) {


    }

}
