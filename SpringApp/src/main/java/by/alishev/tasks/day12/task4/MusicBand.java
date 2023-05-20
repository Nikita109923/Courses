package by.alishev.tasks.day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Member> members;

    public MusicBand(String name, int year, List<Member> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
  /*  public static void transferMembers2(MusicBand bandA, MusicBand bandB){
        for (Member member : bandA.getMembers()) {
            bandB.setMembers(bandA.getMembers());
        }
        bandA.setMembers(null);
    }*/
public static void transferMembers(List<Member> bandA, List<Member> bandB){
    for (Member member : bandA) {
        bandB.add(member);
    }
    bandA.clear();
}
public void printMembers(){
    System.out.println(this.members);
}
}
