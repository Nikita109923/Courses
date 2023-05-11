package by.alishev.tasks.day12.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("BMW");
        list.add("Audi");
        list.add("Volvo");
        list.add("Lada");
        list.add("Tesla");

        System.out.println(list);

        list.add(2, "New Car");
        System.out.println(list);

        list.remove(0);

        System.out.println(list);

    }

}
