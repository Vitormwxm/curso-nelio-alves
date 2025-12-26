package exercicios.tratamentoExcecoes01.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println("Name: " + vect[position]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Acessou uma posição inexistente no array");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("O valor digitado foi diferente de inteiro");
            e.printStackTrace();
        }

        System.out.println("Fim do programa");

    }
}
