package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User user1 : subscriptions) {
            if (user1.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return subscriptions.contains(user) == true && user.getSubscriptions().contains(this) == true;
    }

    public void sendMessage(User user, String text) {
       MessageDatabase.addNewMessage(this,user,text);

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", subscriptions=" + subscriptions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(subscriptions, user.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, subscriptions);
    }
}
