package ro.sci.razvan.ian30;



public class Square extends Shape {
    private double lenght;

    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public Square() { }



    public Square(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double calculateSurface(){
        Square s = new Square();
        double p = s.getLenght()*4;
        return p;
    }




    @Override
    public double calculatePerimeter(){
        return 0;
    }

}
