package by.alishev.tasks.day13;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Nik");
        User user2 = new User("Petro");
        User user3 = new User("Tom");

        user1.sendMassage(user2,"Hello from user1!");
        user1.sendMassage(user2,"How are you?");

        user2.sendMassage(user1,"Hi,user1!");
        user2.sendMassage(user1,"I'm user2, Nice to meet you.");
        user2.sendMassage(user1,"I'm fine,you?");

        user3.sendMassage(user1,"Hello user1");
        user3.sendMassage(user1,"I'm user3");
        user3.sendMassage(user1,"Do you remember me?");

        user1.sendMassage(user3,"Hi user3");
        user1.sendMassage(user3,"Course , i remember");
        user1.sendMassage(user3,"What up?");

        user3.sendMassage(user1,"Ok,you?");

        MessageDatabase.showDialog(user1,user3);

    }
}
