import java.util.ArrayList;
import java.util.List;

public class MyThread implements Runnable {

    ArrayList<Package> bunch = new ArrayList<Package>();
    public MyThread(ArrayList<Package> bunch) {
        this.bunch = bunch;
    }

    public void run() {
        try {
            for (Package p : bunch) {
                java.lang.Thread.sleep(((int) p.getDistanceInKmToTarget()) * 1000);
            }
            DeliveryManager.calculateMerchandiseValueAndProfit(bunch);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
