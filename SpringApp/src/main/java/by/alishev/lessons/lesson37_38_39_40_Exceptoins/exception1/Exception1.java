package by.alishev.lessons.lesson37_38_39_40_Exceptoins.exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Catch exception in main method");
        }
    }
    public static void  readFile() throws FileNotFoundException {
    File file = new File("aa.txt");
    Scanner scan = new Scanner(file);
}
}
