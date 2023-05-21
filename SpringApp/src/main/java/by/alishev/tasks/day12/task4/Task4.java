package by.alishev.tasks.day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersList = new ArrayList<>();
        membersList.add("Name1 LastName1");
        membersList.add("Name2 LastName2");
        membersList.add("Name3 LastName3");
        membersList.add("Name4 LastName4");
        membersList.add("Name5 LastName5");
        membersList.add("Name6 LastName6");

        MusicBand musicBandA = new MusicBand("Group A",1960,membersList);

        List<String> membersList2 = new ArrayList<>();

        MusicBand musicBandB = new MusicBand("Group B",2010,membersList2);

        MusicBand.transferMembers(musicBandA,musicBandB);

        musicBandA.printMembers();
        musicBandB.printMembers();
    }


}
