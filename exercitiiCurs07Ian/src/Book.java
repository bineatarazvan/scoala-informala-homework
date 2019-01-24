/**
 * This is parent class and here we have made the acces method for the varialble of the class
 *Created Ian 2019
 * @Razvan
 */
import java.util.ArrayList;

public class Book {
    private String name;
    private int  numberOfPages;

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfPages() {
         return this.numberOfPages;
     }
     public void setNumberOfpages(int a){
         this.numberOfPages=a;
    }
}


