package by.alishev.tasks.day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("hhjj");
        members1.add("ffa");
        members1.add("hhjWytrj");
        members1.add("rt");
        members1.add("poiu");
        members1.add("lkmn");

        MusicBand band1= new MusicBand("Msdf",1964 ,members1);

        List<String > members2 =  new ArrayList<>();
        members2.add("fgklpp");
        members2.add("tre");
        members2.add("pkoj");
        members2.add("ncx");

        MusicBand band2= new MusicBand("yhb",1960 ,members2);

        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();

    }

}
