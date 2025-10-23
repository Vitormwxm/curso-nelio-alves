package Application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        boolean smallerthanzero = rectangle.width <= 0 || rectangle.height <= 0;

        if(smallerthanzero) {
            System.out.println("There can be no values greater than or equal to zero.");
            return;
        }

        System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
        System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
        System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
    }
}
