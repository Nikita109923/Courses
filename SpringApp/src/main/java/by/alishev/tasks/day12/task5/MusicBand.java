package by.alishev.tasks.day12.task5;

import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<MusicArtist> members;

    public MusicBand(int year, String name, List<MusicArtist> members) {
        this.year = year;
        this.name = name;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public static void transferMember(List<MusicArtist> a, List<MusicArtist> b){
            b.addAll(a);
            a.clear();
    }

    public void printMethod(){
        System.out.println("Members of group " + this.name + " " + this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
