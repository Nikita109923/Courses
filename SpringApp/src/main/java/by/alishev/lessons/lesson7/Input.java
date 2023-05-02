package by.alishev.lessons.lesson7;


import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");
        String s = scanner.nextLine();
        System.out.println("It is that entered by you : " + s);
        System.out.println("Enter some number");
        int x  = scanner.nextInt();
        System.out.println("Your number is : " + x);
    }
}
