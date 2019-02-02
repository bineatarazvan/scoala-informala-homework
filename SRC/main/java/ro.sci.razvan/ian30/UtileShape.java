package ro.sci.razvan.ian30;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UtileShape {

    private List<Shape> stockShape = new ArrayList<>();


    /**
     * Add shape to list if shape is identical will return false, else will return true, and add shape
     */
    public boolean addShape(Shape shape){
        if(this.stockShape.contains(shape)){
            System.out.println("This shape already have been added: " + shape);
            return false;
        }
        else{
            stockShape.add(shape);
            return true;
        }
    }


    /**
     * empty collection of shape
     */
    public void clearStockShape(){
        this.stockShape = new ArrayList<>(0);
    }


    /**
     * Calculate and return the sum off all surface of all kind of shape
     */
    public double calculateSumPerimeter(){
        double sum=0;
        for(Shape  s : stockShape){
           sum += s.calculatePerimeter();
        }
        return round(sum);
    }
    public double calculateSumSurface(){
        double sum = 0;
        for (Shape s : stockShape){
            sum = sum + s.calculatePerimeter();
        }
        return round(sum);
    }

    private static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
