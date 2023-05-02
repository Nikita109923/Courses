package by.alishev.lessons.lesson45;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadeObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            int personCount = objectInputStream.readInt();
            Person[] people = new Person[personCount];
            for (int i = 0; i < personCount; i++) {
               people[i] = (Person) objectInputStream.readObject();
            }
            System.out.println(Arrays.toString(people));
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
