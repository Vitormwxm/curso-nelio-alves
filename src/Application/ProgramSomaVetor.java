package Application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        double[] numerosReais = new double[n];

        for (int i = 0; i < numerosReais.length; i++) {
            System.out.print("Digite um numero: ");
            numerosReais[i] = scanner.nextDouble();
        }

        String valores = "";
        double soma = 0;
        for (int i = 0; i < numerosReais.length; i++) {
           valores += " " + numerosReais[i];
           soma += numerosReais[i];
        }

        double media = soma / numerosReais.length;

        System.out.println("VALORES = " + valores);
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);
    }
}
