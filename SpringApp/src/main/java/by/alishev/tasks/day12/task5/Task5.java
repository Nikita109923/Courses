package by.alishev.tasks.day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist musicArtist1 = new MusicArtist("Name1 LastName1",27);
        MusicArtist musicArtist2 = new MusicArtist("Name2 LastName2",25);
        MusicArtist musicArtist3 = new MusicArtist("Name3 LastName3",63);
        MusicArtist musicArtist4 = new MusicArtist("Name4 LastName4",24);
        MusicArtist musicArtist5 = new MusicArtist("Name5 LastName5",34);
        MusicArtist musicArtist6 = new MusicArtist("Name6 LastName6",44);

        List<MusicArtist> musicArtists = new ArrayList<>();
        musicArtists.add(musicArtist1);
        musicArtists.add(musicArtist2);
        musicArtists.add(musicArtist3);
        musicArtists.add(musicArtist4);
        musicArtists.add(musicArtist5);
        musicArtists.add(musicArtist6);

        List<MusicArtist> musicArtists2 = new ArrayList<>();

        MusicBand musicBandA = new MusicBand("Group 1", 1990,musicArtists);

        MusicBand musicBandB = new MusicBand("Group 2", 2012, musicArtists2);

        MusicBand.transferMembers(musicBandA,musicBandB);

        musicBandA.printMembers();
        musicBandB.printMembers();


    }
}
