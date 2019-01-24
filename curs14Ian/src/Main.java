import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A farm sells animal and vegetable products at the local store.
 * All products have on their packaging the price, validity date and weight.
 * The animal products in the store are the following: milk, eggs and various other products made out of milk (such as cheese, yogurt, sour cream).
 * All animal products have on their packaging storage temperature.
 *          -> All vegetal products describe on their packaging a list of vitamins they contain.
 *
 * Please create a program which simulates the operations at a store.
 * The store has a list of item in stock.
 * Each item refers to a product and has a stock number (could be 0 if it's out of stock).
 * A product is identified uniquely by an ID.
 *
 * When you run the program it should display a list of options:
 *
 * -------------------------------------------------------------
 * 1. Create product and add it to stock
 * 2. Sell product
 * 3. Display daily sales report
 * 4. Exit
 *
 * Choose an option:
 * -------------------------------------------------------------
 *
 * When the user chooses 1, the program displays:
 * -------------------------------------------------------------
 * Product type (1 - animal; 2 - vegetable):
 * -------------------------------------------------------------
 *
 * Based on the user's choice, give him/her the opportunity to input all the relevant properties, create the product
 * and add it to the stock.
 *
 *
 * When the user chooses 2, the program displays a table (don't worry about the table's appearance, just display
 * the data in a readable format) with the products.
 * Give the user the chance to input the product's ID and quantity.
 * The system validates the order first: searches for the product that it exists and if it exists makes sure
 * that it's in stock.
 * If the order is valid, saves the order, with the date when it was placed (date format
 * could be (String): "yyyy-MM-dd"), product ID and quantity.
 *
 * When the user chooses 3, give him/her the chance to enter a date (in the same format used for orders)
 * and display a list with all the orders from that date.
 *
 * When the users chooses 4 the program ends.
 *
 *
 * Important note:
 * - if you don't manage to create and work with the program menu described above, just create programmatically (write the Java code to instantiate) a list of products of various types; then place a few orders; then display the daily report for a particular date.
 *
 * Notes:
 * - we're interested in the interfaces/classes involved in this system and their relationships
 * - write some basic behavior on your classes
 * - commit and push the project to your GitHub account
 * - submit your GitHub pullRequest URL
 *
 * Suggestions:
 * - use lists (https://docs.oracle.com/javase/8/docs/api/java/util/List.html) - get used to constantly checking the Javadoc for info on interfaces/classes/methods
 * - try to use best practices in OOP; extra kudos to you if you program against interfaces (e.g. the type of the variable pointing to the list should be List<MyClass>, but the instance's type should be ArrayList<MyClass>)
 *
 * - try to access methods in a polymorphic fashion where suitable
 * @author Bineata Razvan
 * @20ian
 */


public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<Item> storeItems = new ArrayList<Item>();
        List<Order>savedOrder = new ArrayList<Order>();
        int optionNo = 0;

        do {
            System.out.println("\n\n" +
                    " * 1. Create product and add it to stock\n" +
                    " * 2. Sell product\n" +
                    " * 3. Display daily sales report\n" +
                    " * 4. Exit\n\n" +
                    "Choose an option");

            optionNo = keyboard.nextInt();
            if (optionNo == 1) {
                System.out.println("Choose an option: 1 - animal  2 - vegetable:");
                int option = keyboard.nextInt();
                Product newProductAdded = new Product();
                if (option == 1) {
                    newProductAdded = ProductUtil.createAnimalProduct();
                } else if (option == 2) {
                    newProductAdded = ProductUtil.createVegetableProduct();
                } else {
                    System.out.println("Wrong option");
                }
                // add product in stock
                Item newItem = new Item(newProductAdded, 1);
                storeItems.add(newItem);
            } else if (optionNo == 2) {
                Order o = ProductUtil.sellProducts(storeItems);
                if(o != null) {
                    savedOrder.add(o);
                }
            } else if (optionNo == 3) {
                ProductUtil.displayOrders(savedOrder);
            } else if (optionNo == 4) {
                System.exit(0);
            } else {
                System.out.println("Wrong option");
            }
        }
        while (optionNo != 4);
    }

}
