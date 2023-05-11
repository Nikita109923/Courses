package by.alishev.tasks.day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("fgjj", 1990);
        MusicBand band2 = new MusicBand("jhgf", 1999);
        MusicBand band3 = new MusicBand("fkjhgj", 2011);
        MusicBand band4 = new MusicBand("ndgeg", 1998);
        MusicBand band5 = new MusicBand("iyrjyt", 2001);
        MusicBand band6 = new MusicBand("trb", 2003);
        MusicBand band7 = new MusicBand("op", 2008);
        MusicBand band8 = new MusicBand("uimy", 1992);
        MusicBand band9 = new MusicBand("qwe", 2015);
        MusicBand band10 = new MusicBand("bvx", 1995);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand musicBand : musicBands) {
            if (musicBand.getYear()>2000){
                musicBandsAfter2000.add(musicBand);
            }
        }
        System.out.println(musicBands);
        System.out.println(musicBandsAfter2000);

    }
}
