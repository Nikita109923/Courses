package by.alishev.lessons.Exceptoins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        File file = new File("dfgh");
        try {
            Scanner scan = new Scanner(file);
            System.out.println("после Scanner'a");

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("после блока try catch");

    }
}
