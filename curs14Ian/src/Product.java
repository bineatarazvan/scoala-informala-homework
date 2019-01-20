import java.sql.SQLOutput;
import java.time.LocalDate;

public class Product {
    private static int number=1;

    private String name;
    private double price;
    private LocalDate validity;
    private double weight;
    private int idProduct;
    private int stock;


    public Product(){
    }

    public Product(int idProduct, int stock){
        this.idProduct=idProduct;
        this.stock=stock;
    }

    public Product( String name, double price, LocalDate validity,double weight){
        this.name=name;
        this.idProduct = number++;
        this.price=price;
        this.validity=validity;
        this.weight=weight;
    }



    public int getIdProduct(){
        return idProduct;
    }
    public void setIdProduct(int idProduct){
        this.idProduct=idProduct;
    }

    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }


    public LocalDate getValidity() {
        return validity;
    }
    public void setValidity(LocalDate validity) {
        this.validity = validity;
    }


    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return
                "the product " + name + " has: "+
                "price=" + price +
                ", validity=" + validity +
                ", weight=" + weight +
                ", idProduct=" + idProduct;

    }
}
