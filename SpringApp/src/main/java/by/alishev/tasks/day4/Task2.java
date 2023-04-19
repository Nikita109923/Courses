package by.alishev.tasks.day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max=i;
            }
        }
        System.out.println("Max: " + max);

        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min=i;
            }
        }
        System.out.println("Min: " + min);

        int count=0;
        for (int i : array) {
            if (i%10==0){
                count++;
            }
        }
        System.out.println("number%10==0 : " + count);

        int sum =0;
        for (int j : array) {
            if(j%10==0){
                sum=+j;
            }
        }
        System.out.println("Sum = " + sum);

        }



    }



