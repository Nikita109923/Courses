package by.alishev.tasks.day16.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File file1 = new File("file1.txt");
        PrintWriter pw = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            pw.println(random.nextInt(100));
        }
        pw.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if (counter == 20) {
                pw2.println(sum / 20.0);
                counter = 0;
                sum = 0;
            }
        }
        pw2.close();

        Scanner scanner2 = new Scanner(file2);
        double result = 0;
        while (scanner2.hasNextLine()){
            result+= Double.parseDouble(scanner2.nextLine());
        }
        System.out.println((int)result);
    }
}
