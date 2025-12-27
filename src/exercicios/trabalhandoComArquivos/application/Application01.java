package exercicios.trabalhandoComArquivos.application;

import java.io.*;

public class Application01 {
    public static void main(String[] args) {

        String filePath = "/home/vitor/arquivo.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader); // bufferedReader é estanciado a partir do fileReader

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
