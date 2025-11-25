package ApplicationListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveTerceiroElementoDaList {
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

        System.out.println("DESEJA ATUALIZAR UM NOME DA LISTA? 1-Sim 2-Não");
        int isYes = scanner.nextInt();
        scanner.nextLine();
        if (isYes == 1) {
            System.out.println("Digite a posição do elemento na lista que deseja remover");
            int posicao = scanner.nextInt() - 1;

            System.out.println("Nome Removido: " + nomes.get(posicao));
            nomes.remove(posicao);

            for (int i = 0; i < nomes.size(); i++) {
                System.out.println(nomes.get(i));
            }
        }
    }
}
