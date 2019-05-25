import java.util.Comparator;

public class Package{

    private String targetLocation;
    private double distanceInKmToTarget;
    private int merchandiseValue;

    public Package() {
    }

    public Package(String targetLocation, double distanceInKmToTarget, int merchandiseValue) {
        this.targetLocation = targetLocation;
        this.distanceInKmToTarget = distanceInKmToTarget;
        this.merchandiseValue = merchandiseValue;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    public double getDistanceInKmToTarget() {
        return distanceInKmToTarget;
    }

    public void setDistanceInKmToTarget(double distanceInKmToTarget) {
        this.distanceInKmToTarget = distanceInKmToTarget;
    }

    public int getMerchandiseValue() {
        return merchandiseValue;
    }

    public void setMerchandiseValue(int merchandiseValue) {
        this.merchandiseValue = merchandiseValue;
    }

    @Override
    public String toString() {
        return "Package{" +
                "targetLocation='" + targetLocation + '\'' +
                ", distanceInKmToTarget=" + distanceInKmToTarget +
                ", merchandiseValue='" + merchandiseValue + '\'' +
                '}';
    }


}

