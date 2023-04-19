package by.alishev.tasks.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое , положитльное число ");
        int amount = scanner.nextInt();

        if (amount < 4 && amount > 0) {
            System.out.println(amount);
            System.out.println("Малоэтажный дом");

        } else if (amount > 4 && amount < 9) {
            System.out.println(amount);
            System.out.println("Среднеэтажный дом");

        } else if (amount > 8) {
            System.out.println(amount);
            System.out.println("Многоэтажный дом");

        } else if (amount <= 0) {
            System.out.println("Хотел наебать программу? А хуй тебе! ");
            amount = Math.abs(amount);
            System.out.println(amount);
            if (amount < 4 && amount > 0) {
                System.out.println("Малоэтажный дом");
            } else if (amount > 4 && amount < 9) {
                System.out.println("Среднеэтажный дом");
            } else if (amount > 8) {
                System.out.println("Многоэтажный дом");
            }

        }
    }
}
