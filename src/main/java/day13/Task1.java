package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {

        User user = new User("Vadim");
        User user1 = new User("Andrey");
        User user2 = new User("Roman");
        User user3 = new User("Nikita");


        System.out.println(user.isSubscribed(user1));
        System.out.println(user1.isSubscribed(user));
        System.out.println(user.isFriend(user1));
        System.out.println(user1.getSubscriptions());

        user1.sendMessage(user2,"Привет, " + user2.getUsername());
        user1.sendMessage(user2,"Как дела?");
        user2.sendMessage(user1,"Привет!!! " + user1.getUsername());
        user2.sendMessage(user1,"Все хорошо!");
        user2.sendMessage(user1,"Как у тебя?");

        user3.sendMessage(user1, "Здарова " + user1.getUsername());
        user3.sendMessage(user1,"Ты как?");
        user3.sendMessage(user1, "Как жизнь?");

        user1.sendMessage(user3, "Шалом " + user3.getUsername());
        user1.sendMessage(user3,"Все супер");
        user1.sendMessage(user3, "Ты как?");

        user3.sendMessage(user1, "Лучше всех");

        MessageDatabase.showDialog(user1,user3);









    }
}
