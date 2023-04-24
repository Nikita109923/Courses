package by.alishev.tasks.day9.task1;

public class Human {
 private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = " + name ;
    }

    public void printInfo(){
        System.out.println("This human has name : " + getName());
    }
}
