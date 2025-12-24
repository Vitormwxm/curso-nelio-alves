package exercicios.polimorfismo03.application;

import exercicios.polimorfismo03.entities.Circle;
import exercicios.polimorfismo03.entities.Rectangle;
import exercicios.polimorfismo03.entities.Shape;
import exercicios.polimorfismo03.enums.Color;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of shapes");
        int numberOfShapes = scanner.nextInt();
        scanner.nextLine();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 1; i <= numberOfShapes; i++) {
            System.out.printf("Shape #%d data \n", i);
            System.out.println("Rectangle or Circle (r/c)?");
            char shape = scanner.next().charAt(0);

            if (shape == 'r') {

                System.out.println("Color (Black/Blue/Red)");
                Color color = Color.valueOf(scanner.next());


                System.out.println("Width: ");
                Double width = scanner.nextDouble();

                System.out.println("Height: ");
                Double height = scanner.nextDouble();

                Shape rectangle = new Rectangle(color, width, height);
                shapes.add(rectangle);
            } else {
                System.out.println("Color (Black/Blue/Red)");
                Color color = Color.valueOf(scanner.next());

                System.out.println("Radius: ");
                Double radius = scanner.nextDouble();

                Shape circle = new Circle(color, radius);
                shapes.add(circle);
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape x : shapes) {
            System.out.println(x.area());
        }
    }
}
