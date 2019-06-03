package ro.sci.razvan.ian30;

import java.util.Objects;

public class Rectangle extends Shape{
    private double lenght;
    private double width;

    public Rectangle() { }

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double calculatePerimeter() {
        Rectangle r = new Rectangle(width, lenght);
        double p = r.getWidth()*2+r.getWidth()*2;
        return p;
    }

    @Override
    public double calculateSurface() {
        Rectangle r = new Rectangle(width, lenght);
        return  r.getWidth()*r.getWidth();
        //return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.lenght, lenght) == 0 &&
                Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, width);
    }
}
