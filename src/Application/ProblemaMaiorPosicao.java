package Application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ProblemaMaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers are you going to type?");
        int quantityNumbersToType = scanner.nextInt();
        double[] numberToEnter = new double[quantityNumbersToType];
        double getterNumber = numberToEnter[0];
        int getterNumberPosition = 1;

        for (int i = 0; i < quantityNumbersToType; i++) {
            System.out.println("Enter a number: ");
            numberToEnter[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numberToEnter.length; i++) {
            if(getterNumber < numberToEnter[i]) {
                getterNumber = numberToEnter[i];

                if (i + 1 == numberToEnter.length) {
                    getterNumberPosition = getterNumberPosition + i;
                }
            }
        }

        System.out.println("getter value = " + getterNumber);
        System.out.println("position getter number = " + getterNumberPosition);
    }
}
