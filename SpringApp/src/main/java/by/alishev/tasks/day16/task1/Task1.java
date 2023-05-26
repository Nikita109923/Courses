package by.alishev.tasks.day16.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("input2.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            for (String s : numbers) {
                sum += Integer.parseInt(s);
            }
             double result = sum/(double)numbers.length;

            System.out.printf(result + "-->%.3f ",result);

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
