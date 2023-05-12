package by.alishev.tasks.day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<String> members = new ArrayList<>();
        members.add("Tonny Stark");
        members.add("Andy Houpk ");
        members.add("Tom Holland");
        members.add("Jho Pashy");
        members.add("Nik Polezaev");

        MusicBand band1 = new MusicBand(1990, "Group 1", members);

        List<String > members2 = new ArrayList<>();
        members2.add("Nik Pol");

        MusicBand band2 = new MusicBand(2010 , "Group 2", members2);

        band1.printMembers();
        band2.printMembers();

        System.out.println(band1);
        System.out.println(band2);

        MusicBand.transfertMembers(members,members2);

        System.out.println(band1);
        System.out.println(band2);

    }

}
