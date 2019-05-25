import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Package> myPackageList = new ArrayList<Package>();

        Package package1 = new Package("Galati", 7.0, 100);
        Package package2 = new Package("Brasov", 12.1, 110);
        Package package3 = new Package("Brasov", 9.4, 140);
        Package package4 = new Package("Iasi", 3.9, 180);
        Package package5 = new Package("Cluj", 2.9, 110);

        DeliveryManager.addPackage(myPackageList, package1);
        DeliveryManager.addPackage(myPackageList, package2);
        DeliveryManager.addPackage(myPackageList, package3);
        DeliveryManager.addPackage(myPackageList, package4);

        DeliveryManager.deletePackage(myPackageList,package5);

        /**
         * sort the packageList by target location
         */
        Collections.sort(myPackageList, new SortByTraget());

        DeliveryManager.startDelivery(DeliveryManager.createBunch(myPackageList, "Brasov"));
        DeliveryManager.startDelivery(DeliveryManager.createBunch(myPackageList, "Galati"));
        DeliveryManager.startDelivery(DeliveryManager.createBunch(myPackageList, "Iasi"));
    }
}
