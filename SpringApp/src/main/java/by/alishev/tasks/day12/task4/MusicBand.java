package by.alishev.tasks.day12.task4;


import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<String> members;

    public MusicBand(int year, String name, List<String> members) {
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

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    // This method transfer List

        public static void transfertMembers(List<String> a, List<String> b){
        b.addAll(a);
         a.removeAll(a);
    }
    public void printMembers() {
        System.out.println("Members list " + this.name + " " + this.members);
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
