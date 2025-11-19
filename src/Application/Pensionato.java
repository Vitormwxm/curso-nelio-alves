package Application;

import entities.PensionatoEntitie;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos quartos você ira alugar?");
        int quantidadeQuartos = scanner.nextInt();
        PensionatoEntitie[] quartosParaAlugar = new PensionatoEntitie[9];

        for (int i = 0; i < quantidadeQuartos; i++) {
            scanner.nextLine();
            System.out.println("Informe seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Informe seu email");
            String email = scanner.nextLine();
            System.out.println("Informe o quarto de interesse: ");
            int quarto = scanner.nextInt();

            quartosParaAlugar[quarto] = new PensionatoEntitie(nome, email);
        }

        System.out.println("Quartos ocupados");
        for (int i = 0; i < quartosParaAlugar.length; i++) {

            if (quartosParaAlugar[i] != null) {
                System.out.println( i +": " + quartosParaAlugar[i].getNome() + " , " + quartosParaAlugar[i].getEmail());
            }
        }
    }
}
