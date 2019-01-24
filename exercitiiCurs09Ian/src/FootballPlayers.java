/**
 * th this class we create a consctructor whith 2 param that get value or the variable of the class
 * In this class we have create the methid that give acces for variable
 * we create a method that output the value for our varialble
 *
 *Created 14Ian 2019
 * @RazvanB
 */
import java.util.ArrayList;

public class FootballPlayers {
    private int appearancesNr;
    private int goalsNr;

    FootballPlayers(int appearancesNr, int goalsNr){
        this.appearancesNr=appearancesNr;
        this.goalsNr=goalsNr;
    }

    public void setAppearancesNr(int appearancesNr) {
        this.appearancesNr = appearancesNr;
    }
    public int getAppearancesNr() {
        return appearancesNr;
    }
    public void setGoalsNr(int goalsNr){
        this.goalsNr=goalsNr;
    }

    public int getGoalsNr(){
        return goalsNr;
    }


    public void getDetails(){
        System.out.println("Jucatorul are apperances:" + appearancesNr + " si goals:" + goalsNr);
    }
}
