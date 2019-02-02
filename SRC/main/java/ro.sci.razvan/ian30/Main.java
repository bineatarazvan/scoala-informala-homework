package ro.sci.razvan.ian30;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;


public class Main {

    private List<Shape> stockShape = new ArrayList<>();//lista should be private


    private static UtileShape utileShape = new UtileShape();

    private static void singleShape() {
        utileShape.clearStockShape();
        utileShape.addShape(new Rectangle(2, 3));
        double surface = utileShape.calculateSumPerimeter();
        double perimeter = utileShape.calculateSumSurface();

        if (surface == 10 && perimeter == 9) {
            System.out.println("Single shape works for triangles");
        } else {
            System.out.println("Single triangle might have an issue");
        }
    }


    private static void allShapes() {
        utileShape.clearStockShape();
        if (utileShape.addShape(new Triangle(2,3,4,5)) &&
                utileShape.addShape(new Square(2)) &&
                utileShape.addShape(new Rectangle(4, 2)) &&
                utileShape.addShape(new Circle(3))) {
            System.out.println("All shapes added successfully");
        } else {
            System.out.println("Something went wrong when adding shapes");
        }
        double surface = utileShape.calculateSumPerimeter();
        double perimeter = utileShape.calculateSumSurface();

        if (surface == 50.27 && perimeter == 47.85) {
            System.out.println("All shapes work");
        } else {
            System.out.println("All shapes might have an issue");
        }
    }

    private static void duplicateTriangle() {
        utileShape.clearStockShape();
        if (utileShape.addShape(new Triangle(2, 3, 4, 5)) &&
                utileShape.addShape(new Triangle(2, 3, 4, 5))) {
            System.out.println("2 identical triangles were added");
        }
        double surface = utileShape.calculateSumPerimeter();
        double perimeter = utileShape.calculateSumSurface();

        if (surface == 10 && perimeter == 9) {
            System.out.println("Single shape works for triangles");
        } else {
            System.out.println("Single triangle might have an issue");
        }
    }

    private static void multipleTriangles() {
        utileShape.clearStockShape();
        if (utileShape.addShape(new Triangle(2, 3, 4, 5)) &&
                utileShape.addShape(new Triangle(3, 3, 4, 5)) &&
                utileShape.addShape(new Triangle(4, 3, 4, 5)) &&
                utileShape.addShape(new Triangle(5, 3, 4, 5))) {
            System.out.println("Adding was successful");
        } else {
            System.out.println("Something went wrong when adding shapes");
        }
        double surface = utileShape.calculateSumSurface();
        double perimeter = utileShape.calculateSumPerimeter();

        if (surface == 40 && perimeter == 42) {
            System.out.println("Multiple triangles worked");
        } else {
            System.out.println("Multiple triangles failed");
        }
    }

    private static void circlesAndSquares() {
        utileShape.clearStockShape();
        if (utileShape.addShape(new Circle(2)) &&
                utileShape.addShape(new Circle(3)) &&
                utileShape.addShape(new Square(4)) &&
                utileShape.addShape(new Square(5))) {
            System.out.println("Adding was successful");
        } else {
            System.out.println("Something went wrong when adding shapes");
        }
        double surface = utileShape.calculateSumSurface();
        double perimeter = utileShape.calculateSumPerimeter();

        if (surface == 81.84 && perimeter == 67.42) {
            System.out.println("circlesAndSquares worked");
        } else {
            System.out.println("circlesAndSquares failed");
        }
    }

    public static void main(String[] args) {

        //  List<Shape> stockShape = new ArrayList<>();//lista should be private
        /**
         * Adds a shape to the colection of shapes that will be sumed
         * If a shape is indentical to an existing one false will be returned,
         * or true if is successfully added.
         */

        System.out.println("========== Start single shape");
        singleShape();
        System.out.println("========== Start all shapes");
        allShapes();
        System.out.println("========== Duplicate triangle");
        duplicateTriangle();
        System.out.println("========== Multiple triangles");
        multipleTriangles();
        System.out.println("========== 2 circles & 2 squares");
        circlesAndSquares();


//        Shape shapeRec = new Rectangle();
//        Shape shapeRec2 = new Rectangle();
//        Shape shapeCircle = new Circle();
//        Shape shapeCircle2 = new Circle();
//        Shape shapeSquare = new Square();
//        Shape shapeTriangle = new Triangle();
//       // boolean test ;
//
//        ((Rectangle) shapeRec).setLenght(4);
//        ((Rectangle) shapeRec).setWidth(5);
//        test = ckDubl(shapeRec,stockShape);
//
//        if (test== false){
//            stockShape.add(shapeRec);
//            System.out.println("added!");
//        }
//        else{
//            System.out.println("error!");
//        }
//
//        ((Rectangle) shapeRec2).setLenght(4);
//        ((Rectangle) shapeRec2).setWidth(5);
//        test = ckDubl(shapeRec2,stockShape);
//
//        if (test== false){
//            stockShape.add(shapeRec2);
//            System.out.println("added!");
//        }
//        else{
//            System.out.println("error!");
//        }
//        stockShape.add(shapeRec2);
//
//        ((Circle) shapeCircle).setRaza(3);
//        stockShape.add(shapeCircle);
//        ((Circle) shapeCircle2).setRaza(3);
//
//
//        returnSumPerimeterAndSurface(stockShape);
//        //checkSimilarShape(stockShape);
//    }
//
//    public static void checkSimilarShape(List<Shape> stockShape) {
//        Shape tryShape;
//        for (Shape r : stockShape) {
//            tryShape = r;
//            for (Shape f : stockShape){
//                if (tryShape.equals(f)){
//                    System.out.println("error!! to similar shape");
//                }
//            }
//        }
//        System.out.println("There are no dublicate");
//    }
//
//    public static void returnSumPerimeterAndSurface(List<Shape> stockShape) {
//        double p = 0;
//        double s = 0;
//        for (Shape r : stockShape) {
//            p = (p + r.calculatePerimeter());
//            s = (s + r.calculateSurface());
//        }
//        System.out.println("The total sum for perimeters is:" + p);
//        System.out.println("The total sum for surfaces is:" + s);
//    }
//
////    public static boolean ckDubl (Shape shape, List<Shape> stockShape){
//        boolean flag = false;
//        for (Shape s : stockShape){
//            if(s.equals(shape)){
//                flag = true;
//                System.out.println("Eror dublicate shape:!!!");
//            }
//        }
//        return  flag;
//    }
//
//    public boolean addShape(Shape shape){
//        if(this.stockShape.contains(shape)){
//            System.out.println("The shape has already been added: " + shape);
//            return  false;
//        }
//        this.stockShape.add(shape);
//        return true;
//    }
        /**
         *Calculates and returns the sum of all the *surfaces* of all the shapes stired.
         */

    }
}





















