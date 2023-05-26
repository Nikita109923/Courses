package by.alishev.tasks.day14.my_task;

public class People {
    private String name;
    private int age;
    private String city;

    public People(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "People{ " +
                "name = " + name  +
                ", age = " + age +
                ", city = " + city  +
                '}';
    }
}