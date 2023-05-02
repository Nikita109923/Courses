package by.alishev.lessons.lesson45_46_47;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadeObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person[] people = (Person[]) objectInputStream.readObject();

            System.out.println(Arrays.toString(people));
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
