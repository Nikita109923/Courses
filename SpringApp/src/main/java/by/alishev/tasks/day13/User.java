package by.alishev.tasks.day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscription;

    public User(String userName) {
        this.userName = userName;
        this.subscription = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscription() {
        return subscription;
    }

    public void subscriptUsers(User users) {
        this.subscription.add(users);
    }

    public boolean isSubscribed(User user) {
        for (User currentUser : subscription) {
            if (currentUser.getUserName().equals(user.getUserName())){
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user){
       return this.isSubscribed(user)&& user.isSubscribed(this);
    }
    public void sendMassage(User user,String text){
        MessageDatabase.addNewMessage(this,user,text);
    }

    @Override
    public String toString() {
        return  userName ;
    }
}