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
