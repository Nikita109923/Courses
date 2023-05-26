package by.alishev.tasks.day14.my_task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyTask {
    public static void main(String[] args) {
        System.out.println(parseFileToObjectList());
    }

    public static List<People> parseFileToObjectList() {
        File file = new File("people2.txt");
        List<People> peopleList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String lines = scanner.nextLine();
                String[] people = lines.split(" ");
                if (Integer.parseInt(people[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                People currentPeople = new People(people[0], Integer.parseInt(people[1]), people[2]);
                peopleList.add(currentPeople);
            }
            return peopleList;
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IllegalArgumentException e) {
            System.out.println("File is not correct");
        }
        return null;
    }
}
