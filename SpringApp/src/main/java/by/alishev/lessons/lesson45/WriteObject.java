package by.alishev.lessons.lesson45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person [] people = {new Person(1,"Tom"),new Person(2,"Nik"),
                new Person(3,"Mike")};

        try {
            FileOutputStream outputStream = new FileOutputStream("people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeInt(people.length);

            for (Person person : people) {
                objectOutputStream.writeObject(person);
            }


             objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
