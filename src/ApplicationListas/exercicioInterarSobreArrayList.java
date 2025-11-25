package ApplicationListas;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioInterarSobreArrayList {
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
    }
}
