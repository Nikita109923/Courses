package by.alishev.tasks.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter first number");
            double number1 = scanner.nextInt();
            System.out.println("Enter second number");
            double number2 = scanner.nextInt();
            if (number2 == 0) {
                System.out.println("it's null");
                continue;
            }
            result = number1 / number2;
            System.out.println("Result : " + result);


        }
    }

}

