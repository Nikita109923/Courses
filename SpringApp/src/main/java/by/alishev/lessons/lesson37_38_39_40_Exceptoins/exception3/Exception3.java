package by.alishev.lessons.lesson37_38_39_40_Exceptoins.exception3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        File file = new File("aaa");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("fghjk");
        }
    }
}
