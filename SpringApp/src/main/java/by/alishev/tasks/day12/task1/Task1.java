package by.alishev.tasks.day12.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add(0,"Audi");
        list.add(1,"BMW");
        list.add(2,"Reno");
        list.add(3,"Tesla");
        list.add(4,"Lada");

        System.out.println(list);

        list.add(2,"Ford");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }

}
