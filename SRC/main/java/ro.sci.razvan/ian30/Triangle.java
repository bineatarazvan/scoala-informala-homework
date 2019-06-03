package ro.sci.razvan.ian30;

public class Triangle extends Shape{
    private double width;
    private double hight;
    private double l1;
    private double l2;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }


    public Triangle() {
    }

    public Triangle(double width, double hight, double l1, double l2) {
        this.width = width;
        this.hight = hight;
        this.l1 = l1;
        this.l2 = l2;

    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateSurface() {
        return 0;
    }
}
