import java.util.Comparator;

class SortByTraget implements Comparator<Package> {


    @Override
    public int compare(Package p1, Package p2) {
        return p1.getTargetLocation().compareTo(p2.getTargetLocation());
    }
}
