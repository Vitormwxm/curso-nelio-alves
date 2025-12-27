package exercicios.trabalhandoComArquivos.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        File file = new File("/home/vitor/arquivo.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
