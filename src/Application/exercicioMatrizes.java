package Application;

import java.util.Scanner;

public class exercicioMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========DIGITE A QUANTIDADE DE LINHAS DA MATRIZ=============");
        int linhas = scanner.nextInt();
        System.out.println("=========DIGITE A QUANTIDADE DE COLUNAS DA MATRIZ=============");
        int colunas = scanner.nextInt();
        int[][] matriz = new int[linhas][colunas];

        System.out.println("======DIGITE OS VALORES DA MATRIZ======");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Qual numero você deseja ver as posições e o que tem ao redor dele");
        int ocorrencia = scanner.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if(matriz[i][j] == ocorrencia) {
                    int linhaEncontrada = i;
                    int colunaEncontrada = j;
                    System.out.println("position " + linhaEncontrada + ',' + colunaEncontrada);

                    if (j + 1 >= matriz[i].length) {
                        System.out.println("tem nada na direita");
                    } else {
                        System.out.println("direita: " + matriz[i][j + 1]);
                    }

                    if (j - 1 < 0) {
                        System.out.println("tem nada na esquerda");
                    } else {
                        System.out.println("esquerda: " + matriz[i][j - 1]);
                    }

                    if (i + 1 >= matriz.length) {
                        System.out.println("tem nada em baixo");
                    } else {
                        System.out.println("baixo: " + matriz[i + 1][j]);
                    }

                    if (i - 1 < 0) {
                        System.out.println("tem nada em cima");
                    } else {
                        System.out.println("cima: " + matriz[i - 1][j]);
                    }
                }
            }
        }
    }
}
