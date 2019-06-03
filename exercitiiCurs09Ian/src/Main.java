/**
 * In this class we have the main method for the class FootballPlayers
 *Created 14Ian 2019
 * @RazvanB
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        FootballPlayers p1 = new FootballPlayers(1,1);
//        FootballPlayers p2 = new FootballPlayers(2,2);
//        FootballPlayers p3 = new FootballPlayers(2,3);
//        FootballPlayers p4 = new FootballPlayers(3,1);
//        FootballPlayers p5 = new FootballPlayers(3,3);
//
//        ArrayList<FootballPlayers> player =  new ArrayList<FootballPlayers>();
//        player.add(p1);
//        player.add(p2);
//        player.add(p3);
//        player.add(p4);
//        player.add(p5);
//
//        for(FootballPlayers n:player) {
//            n.getDetails();
            //n.setAppearancesNr(2);
            //n.setGoalsNr(3);
            //System.out.println(n.getAppearancesNr()+" "+n.getGoalsNr());

        fibonacci(5);
    }
    public static int fibonacci (int n) {
        System.out.println(n);
        if (n == 0 || n == 1) {
            System.out.println("--1--");
            return n;

        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

