package by.alishev.tasks.day12.task4;

public class Member {
    private String membersName;

    public Member(String membersName) {
        this.membersName = membersName;
    }

    public String getMembersName() {
        return membersName;
    }

    public void setMembersName(String membersName) {
        this.membersName = membersName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "membersName='" + membersName + '\'' +
                '}';
    }
}
