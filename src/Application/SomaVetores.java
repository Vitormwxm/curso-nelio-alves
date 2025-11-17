package Application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many values will each vector have?");
        int quantityValuesToVector = scanner.nextInt();

        System.out.println("Enter the values for vector A");
        int[] vectorA = new int[quantityValuesToVector];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = scanner.nextInt();
        }

        System.out.println("Enter the values for vector B");
        int[] vectorB = new int[quantityValuesToVector];

        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = scanner.nextInt();
        }

        int[] vectorSumOfPosition = new int[quantityValuesToVector];

        for (int i = 0; i < vectorSumOfPosition.length; i++) {
            vectorSumOfPosition[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("VETOR RESULT: ");
        for (int i = 0; i < vectorSumOfPosition.length; i++) {
            System.out.println(vectorSumOfPosition[i]);
        }




    }
}
