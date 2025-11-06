package Application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Products[] vect = new Products[n];

        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double preco = scanner.nextDouble();
            vect[i] = new Products(preco, name);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPreco();
        }

        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        scanner.close();
    }
}
