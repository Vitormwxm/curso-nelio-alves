package Application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidadeNumeroAdigitar = scanner.nextInt();
        int vect[] = new int[quantidadeNumeroAdigitar];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0){
                contador += 1;
            }
        }

        int[] numeroPar = new int[contador];
        int pos = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                numeroPar[pos] = vect[i];
                pos++;
            }
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < numeroPar.length; i++) {
            System.out.println(numeroPar[i]);
        }

        System.out.println("Quantidade de pares = " + numeroPar.length);
    }
}
