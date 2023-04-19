package by.alishev.tasks.day4;

import java.util.Random;
import java.util.Scanner;

public class Task1_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int[] array = new int[amount];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.println(array[i]);
        }
        System.out.println("number %2 != 0");
        int count =0;
        for (int i : array) {
            if(i%2!=0){
                count++;
            }
        }
        System.out.println(count);

    }
}

