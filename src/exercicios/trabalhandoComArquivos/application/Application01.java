package exercicios.trabalhandoComArquivos.application;

import java.io.*;

public class Application01 {
    public static void main(String[] args) {

        String filePath = "/home/vitor/arquivo.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
