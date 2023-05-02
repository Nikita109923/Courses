package by.alishev.lessons.lesson45_46_47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Mike");
        // try  с ресурсами
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            objectOutputStream.writeObject(person1);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
