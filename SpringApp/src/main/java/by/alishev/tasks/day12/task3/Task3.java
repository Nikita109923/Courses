package by.alishev.tasks.day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Group 1" , 1960);
        MusicBand musicBand2 = new MusicBand("Group 2" , 1970);
        MusicBand musicBand3 = new MusicBand("Group 3" , 1980);
        MusicBand musicBand4 = new MusicBand("Group 4" , 1990);
        MusicBand musicBand5 = new MusicBand("Group 5" , 1950);
        MusicBand musicBand6 = new MusicBand("Group 6" , 1990);
        MusicBand musicBand7 = new MusicBand("Group 7" , 2001);
        MusicBand musicBand8 = new MusicBand("Group 8" , 2006);
        MusicBand musicBand9 = new MusicBand("Group 9" , 2010);
        MusicBand musicBand10 = new MusicBand("Group 10" , 2015);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(musicBand1);
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);
        bands.add(musicBand10);

       //System.out.println(bands);

        Collections.shuffle(bands);

        //System.out.println(bands);

        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand x : bands) {
            if (x.getYear()>2000){
                bandsAfter2000.add(x);
            }
        }
        System.out.println(bandsAfter2000);
        System.out.println(bands);

    }
}
