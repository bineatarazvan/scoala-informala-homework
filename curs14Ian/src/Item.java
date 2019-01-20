import java.lang.reflect.Array;
import java.util.ArrayList;

public class Item {

    private Product product;
    private int stock;

    public Item(Product product, int stock) {
        this.product = product;
        this.stock = stock;
    }


    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }


    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
