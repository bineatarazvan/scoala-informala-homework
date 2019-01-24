import java.time.LocalDate;

public class Order {
    private LocalDate data;
    private int id;
    private int stock;

    public Order(LocalDate data, int id, int stock){
        this.data = data;
        this.id = id;
        this.stock = stock;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
