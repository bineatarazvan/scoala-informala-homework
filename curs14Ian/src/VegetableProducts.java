import java.time.LocalDate;

public class VegetableProducts extends Product{

    private String packagingDescribe;

    public VegetableProducts(){

    }

    public VegetableProducts( String name, double price, LocalDate validity, double weight, String packagingDescribe){
        super( name, price, validity, weight);
        this.packagingDescribe=packagingDescribe;
    }



    public String getPackagingDescrbe () {
        return packagingDescribe;
    }
    public void setPackagingDescrbe(String packagingDescrbe) {
        this.packagingDescribe = packagingDescrbe;
    }

    @Override
    public String toString() {
        return "VegetableProducts{" +
                super.toString() +
                " packagingDescribe='" + packagingDescribe + '\'' +
                '}';
    }
}
