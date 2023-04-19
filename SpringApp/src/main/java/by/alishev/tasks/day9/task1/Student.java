package by.alishev.tasks.day9.task1;

public class Student extends Human{
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void getInfo() {
       super.getInfo();
        System.out.println("This student has name " + getName());
    }
}
