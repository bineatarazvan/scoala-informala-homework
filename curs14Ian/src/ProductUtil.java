import java.time.LocalDate;
import java.util.Scanner;
import java.util.List;


public class ProductUtil {
    /**
     * create a vegetableProduct object
     */
    public static Product createVegetableProduct() {
        Scanner keyboard = new Scanner(System.in);
        VegetableProducts vegetable = new VegetableProducts();


//        System.out.println("Please insert the id number of the product:");
//        vegetable.setIdProduct(keyboard.nextInt());

        System.out.println("Please insert the name of the product:");
        vegetable.setName(keyboard.next());

        System.out.println("Please insert the price of the product:");
        vegetable.setPrice(keyboard.nextDouble());

        System.out.println("Please insert the last date of valability of the product in format yyyy-mm-dd");
        vegetable.setValidity(LocalDate.parse(keyboard.next()));

        System.out.println("Please insert the weight of the product");
        vegetable.setWeight(keyboard.nextDouble());

        System.out.println("Please insert the storage packaging of the product");
        vegetable.setPackagingDescrbe(keyboard.next());

        System.out.println("The product has been created ! \n " + vegetable.toString());

        return vegetable;
    }


    public static Product createAnimalProduct() {
        Scanner keyboard = new Scanner(System.in);
        AnimalProducts animal = new AnimalProducts();

      animal.setIdProduct(keyboard.nextInt());

        System.out.println("Please insert the name of the product:");
        animal.setName(keyboard.next());

        System.out.println("Please insert the price of the product:");
        animal.setPrice(keyboard.nextDouble());

        System.out.println("Please insert the last date of valability of the product in format yyyy-mm-dd");
        animal.setValidity(LocalDate.parse(keyboard.next()));

        System.out.println("Please insert the weight of the product");
        animal.setWeight(keyboard.nextDouble());

        System.out.println("Please insert the storage temperature of the product");
        animal.setStorageTemperature(keyboard.next());

        System.out.println("The product has been created ! \n " + animal.toString());

        return animal;
    }

    public static Order sellProducts(List<Item> productList) {

        for(Item i : productList){
            Product p = i.getProduct();
            System.out.println(p);
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give the id for the product");
        int idP = keyboard.nextInt();
        System.out.println("Give the quanyity for the product");
        int quantity = keyboard.nextInt();

        for(Item itemObj:productList){
            Product p = itemObj.getProduct();
            int stock =itemObj.getStock();
            int idCurrentProduct =p.getIdProduct();
            if((idCurrentProduct==idP)&&(stock>=quantity)){
               Order savedOrder = new Order( LocalDate.now(),idCurrentProduct,idP);
               return  savedOrder;
            }
        }
        System.out.println("The order is not valid");
        return null;
    }

    public static void displayOrders(List<Order> orderList) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a date to see the list orders of this date");
        String date = keyboard.next();
        int count = 0;
        for(Order x:orderList){
            String objDate = x.getData().toString();

            if(date.equals(objDate)) {
                System.out.println(x);
                count++;
            }
        }
        if(count==0){
            System.out.println("For this date doesn't exist any order.");
        }
    }
}
