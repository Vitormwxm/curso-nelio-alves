package ApplicationListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PesquisarElementoEmUmaLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // serve para entrar dados no console
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite a quantidade de nomes para adicionar na lista");
        int quantidadeNomes = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quantidadeNomes; i++) {

            System.out.println("Digite um nome na lista");

            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.println("==========ITERANDO SOBRE OS NOMES NA LISTA========================");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("DESEJA FILTRAR UM NOME NA LISTA? 1-Sim 2-Não");
        int isYes = scanner.nextInt();
        scanner.nextLine();
        if (isYes == 1) {
            System.out.println("Digite o nome do elemento que deseja filtrar na lista");
            String nome = scanner.nextLine();
            // usando expressão Lambda
            String nomeAchado = nomes.stream().filter(x -> x.equalsIgnoreCase(nome)).findFirst().orElse(null);

            System.out.println("o index do nome na lista é " + nomes.indexOf(nomeAchado));
            for (int i = 0; i < nomes.size(); i++) {
                System.out.println(nomes.get(i));
            }
        }
    }
}
