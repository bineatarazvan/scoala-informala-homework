import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Razvan Bineata
 * @date 25/02/2019
 * utility class for that handle interaction with client
 */

public class DeliveryManager {
    /**
     *
     * this method start thread
     * @param bunch
     */
    public static void startDelivery(ArrayList<Package> bunch){

        Thread t1 = new Thread(new MyThread(bunch));
        t1.start();
    }

    /**
     *
     * this method add pachage in Arraylist
     * @param packageList
     * @param p
     * @return
     */
    public static ArrayList<Package> addPackage(ArrayList<Package> packageList, Package p){
        packageList.add(p);
        return packageList;
    }

    /**
     *
     * this method deletePackage from an ArrayList
     * @param packageArrayList
     * @param p
     * @return
     */
    public  static ArrayList<Package> deletePackage(ArrayList<Package> packageArrayList,Package p){
        packageArrayList.remove(p);
        return packageArrayList;
    }

    /**
     *
     * in this method is used for calculating the profit and the merchandiseValue
     * @param list
     */
    public static void calculateMerchandiseValueAndProfit(List<Package> list){

        int merchandiseValue = 0;
        int profit = 0;
        for(Package p : list){
                merchandiseValue = merchandiseValue + p.getMerchandiseValue();
                profit = profit + (int) p.getDistanceInKmToTarget();
        }
        System.out.println("Merchandise value = " + merchandiseValue + " and profit = " + profit + " for " +
                "target value = " + list.get(0).getTargetLocation());
    }

    /**
     *
     * thi method is user to create a bunch of package whith a pecific target locatioon
     * @param list
     * @param tagetLocation
     * @return
     */
    public static ArrayList<Package> createBunch(List<Package> list, String tagetLocation){

        ArrayList<Package> bunch = new ArrayList<Package>();
        for(Package p : list){
            if(tagetLocation != null && p.getTargetLocation().equals(tagetLocation)){
                bunch.add(p);
            }
        }
        return bunch;
    }
}