package Application;

import entities.Alturas;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();
        Alturas[] vetorPessoas = new Alturas[n];

        for (int i = 0; i < vetorPessoas.length; i++) {
            scanner.nextLine();
            System.out.println("Dados da " + (1+i) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            vetorPessoas[i] = new Alturas(nome, idade, altura);
        }

        double altura = 0;
        int pessoasComMenos16 = 0;
        for (int i = 0; i < vetorPessoas.length; i++) {
            altura += vetorPessoas[i].getAltura();

            if (vetorPessoas[i].getIdade() < 16) {
                pessoasComMenos16 += 1;

            }
        }
        double alturaMedia = altura / vetorPessoas.length;
        double porcentagemMenos16 = pessoasComMenos16 * 100 / vetorPessoas.length;
        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagemMenos16 + "%");
        for (int i = 0; i < vetorPessoas.length; i++) {
            if (vetorPessoas[i].getIdade() < 16) {
                System.out.println(vetorPessoas[i].getNome());
            }
        }


    }
}
