package by.alishev.lessons.lesson10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        switch (age){
            case 0 :
                System.out.println("You is boring");
                break;
            case 7 :
                System.out.println("You start  going to school");
                break;
            case 18 :
                System.out.println("You graduate from school ");
                break;
            default:
                System.out.println("Nothing fits");

        }


    }
}
