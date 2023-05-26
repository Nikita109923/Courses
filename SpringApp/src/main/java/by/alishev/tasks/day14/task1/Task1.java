package by.alishev.tasks.day14.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("input.txt");

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(", ");
            if (numbersString.length!=10){
                throw  new IllegalArgumentException();
            }
            int[] numbers = new int[10];
            int sum =0;

            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! File is not exist");
        } catch (IllegalArgumentException e) {
            System.out.println("Numbers amount is not right");
        }

    }
}
