package Application;

import entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos Alunos serao digitados? ");
        int quantidadeAlunosParaInserir = scanner.nextInt();

        Alunos[] alunos = new Alunos[quantidadeAlunosParaInserir];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();

            alunos[i] = new Alunos(nome, nota1 , nota2);
        }
        String[] alunosAprovados = new String[quantidadeAlunosParaInserir];

        for (int i = 0; i < alunos.length; i++) {
            double media = (alunos[i].getNota1() + alunos[i].getNota2()) / 2.0;

            if ( media > 6.0) {
                alunosAprovados[i] = alunos[i].getName();
            }
        }

        System.out.println("Alunos aprovados");
        for (int i = 0; i < alunosAprovados.length; i++) {
            if (alunosAprovados[i] != null) {
                System.out.println(alunosAprovados[i]);
            }
        }
    }
}
