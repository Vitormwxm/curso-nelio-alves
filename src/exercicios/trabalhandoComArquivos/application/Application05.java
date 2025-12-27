package exercicios.trabalhandoComArquivos.application;

import java.io.File;
import java.util.Scanner;

public class Application05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o caminho de um arquivo");

        String strPath = scanner.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getName: " + path.getParent());

        scanner.close();
    }
}
