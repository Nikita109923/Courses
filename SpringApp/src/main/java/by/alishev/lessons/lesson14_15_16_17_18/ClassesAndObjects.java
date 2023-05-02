package by.alishev.lessons.lesson14_15_16_17_18;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Nikita");
        person1.setAge(-2);
        System.out.println(person1.getName() + "  " + person1.getAge());

        Person person2 = new Person();
        person2.setName("Vova");
        person2.setAge(47);
    }

}

class Person {
   private String name;
  private  int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int userAge) {
        if(userAge<0){
            System.out.println("Error! Age < 0");
        }else {
            age = userAge;
        }
    }

    void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Error! variables name is empty");
        }else{
            name = userName;
        }
    }

    int calculateYearsToRetired() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ". I'm " + age);
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }

}
