package by.alishev.lessons.lesson45_46_47;

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

            objectOutputStream.writeObject(people);

             objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
