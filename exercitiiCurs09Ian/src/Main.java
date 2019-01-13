import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayers p1 = new FootballPlayers(1,1);
        FootballPlayers p2 = new FootballPlayers(2,2);
        FootballPlayers p3 = new FootballPlayers(2,3);
        FootballPlayers p4 = new FootballPlayers(3,1);
        FootballPlayers p5 = new FootballPlayers(3,3);

        ArrayList<FootballPlayers> player =  new ArrayList<FootballPlayers>();
        player.add(p1);
        player.add(p2);
        player.add(p3);
        player.add(p4);
        player.add(p5);

        for(FootballPlayers n:player) {
            n.getDetails();
            //n.setAppearancesNr(2);
            //n.setGoalsNr(3);
            //System.out.println(n.getAppearancesNr()+" "+n.getGoalsNr());
        }
    }
}
