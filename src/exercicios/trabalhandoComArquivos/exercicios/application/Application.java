package exercicios.trabalhandoComArquivos.exercicios.application;

import javax.xml.transform.Source;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um caminho de arquivo");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            List<String> words = new ArrayList<>();

            String lines = bufferedReader.readLine();
            while (lines != null) {
                String[] wordLine = lines.split(",");

                for (String p : wordLine) {
                    words.add(p.trim());
                }

                lines = bufferedReader.readLine();
            }

            for (String palavra : words) {
                System.out.println(palavra);
            }

            File filePath = new File(path);
            boolean success = new File(filePath.getParent() + "/out").mkdir();
            File createFile = new File(filePath.getParent() + "/out/summary.csv");
            createFile.createNewFile();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(createFile))) {

                for (int i = 0; i < words.size(); i += 3) {
                    String nome = words.get(i);
                    double preco = Double.parseDouble(words.get(i + 1));
                    int quantidade = Integer.parseInt(words.get(i + 2));

                    double totalValue = preco * quantidade;

                    bw.write(nome + "," + String.format("%.2f", totalValue));
                    bw.newLine();
                }

                System.out.println("Arquivo summary.csv criado com sucesso!");

            } catch (IOException e) {
                e.getMessage();
            }

        } catch (IOException e) {
            e.getMessage();
        }

    }
}
