package by.alishev.tasks.day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");

        while (true) {
            String city = scanner.nextLine();

            if (city.equals("Stop"))
                break;

            switch (city) {
                case "Moskva":
                case "Vladivostok":
                case "Rostov":
                    System.out.println("Russia");
                    break;

                case "Rim":
                case "Milan":
                case "Tyrin":
                    System.out.println("Italia");
                    break;
                default:
                    System.out.println("xz");
            }
        }
    }
}