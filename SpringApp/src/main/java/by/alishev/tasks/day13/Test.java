package by.alishev.tasks.day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Nik");
        User user2 = new User("Petro");
        User user3 = new User("Tom");

        user1.sendMessage(user2,"Hello from user1!");
        user1.sendMessage(user2,"How are you?");

        user2.sendMessage(user1,"Hi,user1!");
        user2.sendMessage(user1,"I'm user2, Nice to meet you.");
        user2.sendMessage(user1,"I'm fine,you?");

        user3.sendMessage(user1,"Hello user1");
        user3.sendMessage(user1,"I'm user3");
        user3.sendMessage(user1,"Do you remember me?");

        user1.sendMessage(user3,"Hi user3");
        user1.sendMessage(user3,"Course , i remember");
        user1.sendMessage(user3,"What up?");

        user3.sendMessage(user1,"Ok,you?");

        MessageDatabase.showDialog(user1,user3);

        user1.subscribe(user3);
        user1.subscribe(user2);

        user2.subscribe(user3);
        user2.subscribe(user1);

        System.out.println();
        System.out.println(user1.isSubscribe(user2));
        System.out.println(user1.isSubscribe(user3));
        System.out.println(user1.ifFriend(user2));
        System.out.println(user1.ifFriend(user3));
        System.out.println();
        System.out.println(user2.isSubscribe(user1));
        System.out.println(user2.isSubscribe(user3));
        System.out.println(user2.ifFriend(user1));
        System.out.println(user2.ifFriend(user3));
        System.out.println();
        System.out.println(user3.isSubscribe(user1));
        System.out.println(user3.isSubscribe(user2));
        System.out.println(user3.ifFriend(user1));
        System.out.println(user3.ifFriend(user2));

        Message message = new Message(user1,user3,"Hi");
        System.out.println(message);
    }
}
