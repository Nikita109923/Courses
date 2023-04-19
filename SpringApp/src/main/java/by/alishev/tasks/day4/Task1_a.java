package by.alishev.tasks.day4;

import java.util.Random;
import java.util.Scanner;

public class Task1_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int[] array = new int[amount];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("arrays length = " + array.length);

    }
}

