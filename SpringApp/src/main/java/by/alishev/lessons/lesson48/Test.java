package by.alishev.lessons.lesson48;

public class Test {
    public static void main(String[] args) {
        EAnimal animal = EAnimal.CAT;
        System.out.println(animal);

        //
//        switch (animal){
//            case CAT:
//                System.out.println("it is a cat");
//                break;
//            case FROG:
//                System.out.println("it is a frog");
//                break;
//        }

        ESeason season = ESeason.SUMMER;
        System.out.println(season.getTemperature());

//        if (season == ESeason.SUMMER){
//            System.out.println("it's warm outside");
//        } else if (season== ESeason.SPRING) {
//            System.out.println("it's okay outside");
//        }else {
//            System.out.println("it's colt");
//        }
    }
}
