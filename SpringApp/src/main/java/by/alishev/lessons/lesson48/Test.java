package by.alishev.lessons.lesson48;

public class Test {
    public static void main(String[] args) {
        ESeason season = ESeason.SUMMER;
        EAnimal animal = EAnimal.CAT;
        System.out.println(animal.name());

        EAnimal cat = EAnimal.valueOf("CAT");
        System.out.println(cat.getTranslation());

        ESeason season1 = ESeason.WINTER;
        System.out.println(season1.ordinal());

    }
}
