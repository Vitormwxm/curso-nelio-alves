package exercicios.trabalhandoComArquivos.application;

import java.io.File;
import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um caminho de pasta");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        // pegar todas as pastas a partir

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "/subdir").mkdir();
        System.out.println("Diretorio criado com sucesso" + success);

        scanner.close();
    }
}
