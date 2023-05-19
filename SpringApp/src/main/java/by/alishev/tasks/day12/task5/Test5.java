package by.alishev.tasks.day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        MusicArtist artists1 = new MusicArtist("Jho Blu",56 );
        MusicArtist artists2 = new MusicArtist("Mike Rurige",56 );
        MusicArtist artists3 = new MusicArtist("Antony Hoypkins",56 );
        MusicArtist artists4 = new MusicArtist("Mat Daymant",56 );
        MusicArtist artists5 = new MusicArtist("Nikita Polezaev",56 );

        List<MusicArtist> artistList1 = new ArrayList<>();
        artistList1.add(artists1);
        artistList1.add(artists2);
        artistList1.add(artists3);
        artistList1.add(artists4);
        artistList1.add(artists5);

        MusicArtist artists6 = new MusicArtist("Nastya",56 );
        MusicArtist artists7 = new MusicArtist("Maks",56 );
        MusicArtist artists8 = new MusicArtist("Danyk",56 );

        List<MusicArtist> artistList2 = new ArrayList<>();
        artistList2.add(artists6);
        artistList2.add(artists7);
        artistList2.add(artists8);

        MusicBand musicBand1 = new MusicBand(1960,"Group 1",artistList1);
        MusicBand musicBand2 = new MusicBand(1990,"Group 2",artistList2);

        System.out.println(musicBand1);
        System.out.println(musicBand2);

        MusicBand.transferMember(musicBand1.getMembers(),musicBand2.getMembers());
        System.out.println();
        System.out.println(musicBand1);
        System.out.println(musicBand2);

        musicBand1.printMethod();
        musicBand2.printMethod();
    }

}
