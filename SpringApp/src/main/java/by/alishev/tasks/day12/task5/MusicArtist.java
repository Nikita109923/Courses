package by.alishev.tasks.day12.task5;

public class MusicArtist {
    private String artistName;
    private int age;

    public MusicArtist(String artistName, int age) {
        this.artistName = artistName;
        this.age = age;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "artistName='" + artistName + '\'' +
                ", age=" + age +
                '}';
    }
}
