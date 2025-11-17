package Application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many values will vector have?");
        int quantityValuesVector = scanner.nextInt();
        int[] vector = new int[quantityValuesVector];
        int[] vectorPair = new int[quantityValuesVector];
        int totalPair = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter a pair");
            vector[i] = scanner.nextInt();
            if(vector[i] % 2 == 0) {
                vectorPair[i] = vector[i];
                totalPair = totalPair + 1;
            }
        }

        double avaragePairs;
        if (totalPair != 0) {
            avaragePairs = Arrays.stream(vectorPair).sum() / totalPair;
        } else {
            avaragePairs = 0;
        }

        if (avaragePairs != 0) {
            System.out.println("AVAREGE PAIS: " + avaragePairs);
        } else {
            System.out.println("any pairs");
        }



    }
}
