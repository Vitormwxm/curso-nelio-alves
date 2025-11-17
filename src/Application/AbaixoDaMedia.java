package Application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many values will the vector have?");
        int quantityNumbersVector = scanner.nextInt();
        double[] vector = new double[quantityNumbersVector];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter a value");
            vector[i] = scanner.nextDouble();
        }

        double vectorFinalSum =  Arrays.stream(vector).sum();

        double vectorAvarage = vectorFinalSum / quantityNumbersVector;

        System.out.println("Vector Avarege = " + vectorAvarage);
        System.out.println("Elements below avarege: ");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] < vectorAvarage) {
                System.out.println(vector[i]);
            }
        }
    }
}
