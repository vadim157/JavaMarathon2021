package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int st = random.nextInt(11) + 90;

        Player player1 = new Player(st);
        Player player2 = new Player(st);
        Player player3 = new Player(91);
        Player.info();
        Player player4 = new Player(st);
        Player player5 = new Player(st);
        Player player6 = new Player(st);
        Player.info();
        Player player7 = new Player(st);
        Player.info();

//        for( int i = 0; i < 93; i++){
//            player3.run();
//            Player.info();
//            System.out.println(player3.getStamina());
//        }
//
////        player3.run();
////        Player.info();
////        System.out.println(player3.getStamina());



    }
}
