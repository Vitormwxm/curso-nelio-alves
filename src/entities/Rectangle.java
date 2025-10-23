package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return width + width + width + width;
    }

    public double diagonal() {
        double calcPotencia = Math.pow(width, 2) + Math.pow(height, 2);
        double diagonal = Math.sqrt(calcPotencia);
        return diagonal;
    }

//    public String toString(){
//        return "AREA = " + String.format("%.2f", area())
//                + "PERIMETER = " + String.format("%.2f", perimeter())
//                +
//    }

}
