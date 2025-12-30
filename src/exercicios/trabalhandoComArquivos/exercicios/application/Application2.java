package exercicios.trabalhandoComArquivos.exercicios.application;

import exercicios.trabalhandoComArquivos.exercicios.entities.Product;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo que deseja fazer a leitura");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        System.out.println("===================LENDO-ARQUIVO===================");

        Product product = new Product();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String lines = br.readLine();

            while (lines != null) {
                String[] words = lines.split(",");
                String productName = words[0];
                Double productPrice = Double.parseDouble(words[1]);
                Integer productQuantity = Integer.parseInt(words[2]);

                Product item = new Product(productName, productPrice, productQuantity);
                product.addList(item);

                lines = br.readLine();
            }


        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Digite o nome da pasta que você deseja criar");

        String fileName = scanner.nextLine();
        File fileStrPath = new File(strPath);
        boolean file = new File(fileStrPath.getParent() + "/" + fileName).mkdir();

        File directory = new File(fileStrPath.getParent() + "/" + fileName);
        File createFile = new File(directory, "summary.csv");

        try (BufferedWriter wr = new BufferedWriter(new FileWriter(createFile))){


            for (Product p : product.getList()) {
                String line = p.getProduct() + "," + String.format("%.2f", p.totalValue());
                wr.write(line);
                wr.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
