package ro.sci.razvan.ian30;

public class Circle extends Shape {
    private double raza;

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public Circle(double raza) {
        this.raza = raza;
    }

    public Circle() {
    }



    @Override
    public double calculatePerimeter() {

       return 0;
    }

    @Override
    public double calculateSurface() {

        Circle newCircle = new Circle(raza);
        double raza = this.getRaza();

        double surafce = Math.PI * raza * raza;

        return surafce;
    }
}
