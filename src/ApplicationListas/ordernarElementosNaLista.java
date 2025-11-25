package ApplicationListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ordernarElementosNaLista {
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

        System.out.println("DESEJA ORDENAR OS NOMES DA LISTA? 1-Sim 2-Não");
        int isYes = scanner.nextInt();
        scanner.nextLine();
        if (isYes == 1) {

            // ordena arrayList, se for String em ordem alfabética, inteiro em ordem numerica,
            Collections.sort(nomes);
            for (int i = 0; i < nomes.size(); i++) {
                System.out.println(nomes.get(i));
            }
        }
    }
}
