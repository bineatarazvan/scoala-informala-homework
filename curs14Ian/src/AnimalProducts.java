import java.time.LocalDate;

public class AnimalProducts extends Product{

    private String storageTemperature;

    public AnimalProducts(){

    }

    public AnimalProducts( String name, double price, LocalDate validity, double weight, String storageTemperature){
        super( name, price,  validity, weight);
        this.storageTemperature=storageTemperature;
    }
    public String getStorageTemperature() {
        return storageTemperature;
    }
    public void setStorageTemperature(String storageTemperature) {
        this.storageTemperature = storageTemperature;
    }

    @Override
    public String toString() {
        return "AnimalProducts{" +
                super.toString() +
                " storageTemperature='" + storageTemperature + '\'' +
                '}';
    }
}
