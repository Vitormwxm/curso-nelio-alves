package exercicios.trabalhandoComArquivos.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application03 {
    public static void main(String[] args) {

        String[] lines = {"Good morning", "Good afternoon", "Good night"};

        String path = "/home/vitor/arquivo.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
                for (String line : lines) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }


    }
}
