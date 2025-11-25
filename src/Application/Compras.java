package Application;

import entities.Tarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Tarefas> tarefas = new ArrayList<>();
        System.out.println("==============TAREFAS===============");
        int simNao;
        do {
            System.out.println("Deseja adicionar uma tarefa? 1- SIM , 2- NAO");
            simNao = scanner.nextInt();

            if(simNao == 1) {
                System.out.println("Digite a prioridade da tarefa");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o nome da tarefa: ");
                String nomeTarefa = scanner.nextLine();

                Tarefas tarefa = new Tarefas(id, nomeTarefa);
                tarefas.add(tarefa);
            }

            System.out.println("========TAREFAS ADICIONADAS===========");

            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(tarefas.get(i).getId() + " - " + tarefas.get(i).getNome());
            }

            if (tarefas.size() >= 1) {
                System.out.println("DESEJA EXCLUIR ALGUM ITEM DA LISTA? 1-SIM 2-NÃO");
                int excluir = scanner.nextInt();
                if (excluir == 1) {
                    System.out.println("===============SELECIONE UM ITEM PELO NUMERO PARA EXCLUIR======================");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(tarefas.get(i).getId() + " - " + tarefas.get(i).getNome());
                    }

                    int itemExcluir = scanner.nextInt();
                    tarefas.remove(itemExcluir - 1);
                    System.out.println("ITEM: " + tarefas.get(itemExcluir + 1).getNome() + "EXCLUÍDO");
                }
            }

        } while (simNao == 1);
    }
}
