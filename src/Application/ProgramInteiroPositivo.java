package Application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramInteiroPositivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidadeNumeroAdigitar = scanner.nextInt();
        int vect[] = new int[quantidadeNumeroAdigitar];

        if (quantidadeNumeroAdigitar > 10) {
            System.out.println("numero máximo permitido é 10");
            return;
        }

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }
}
