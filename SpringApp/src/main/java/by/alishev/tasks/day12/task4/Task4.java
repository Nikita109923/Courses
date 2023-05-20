package by.alishev.tasks.day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Member member1 = new Member("Name1 LastName1");
        Member member2 = new Member("Name2 LastName2");
        Member member3 = new Member("Name3 LastName3");
        Member member4 = new Member("Name4 LastName4");
        Member member5 = new Member("Name5 LastName5");
        Member member6 = new Member("Name6 LastName6");

        List<Member> membersList = new ArrayList<>();
        membersList.add(member1);
        membersList.add(member2);
        membersList.add(member3);
        membersList.add(member4);
        membersList.add(member5);
        membersList.add(member6);

        MusicBand musicBandA = new MusicBand("Group A",1960,membersList);

        List<Member> membersList2 = new ArrayList<>();

        MusicBand musicBandB = new MusicBand("Group B",2010,membersList2);
        MusicBand.transferMembers(membersList,membersList2);
       //System.out.println(musicBandB);
       //System.out.println(musicBandA);
        musicBandA.printMembers();
        musicBandB.printMembers();
    }


}
