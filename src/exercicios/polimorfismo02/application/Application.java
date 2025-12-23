package exercicios.polimorfismo02.application;

import exercicios.polimorfismo02.entities.ImportedProduct;
import exercicios.polimorfismo02.entities.Product;
import exercicios.polimorfismo02.entities.UsedProduct;

import javax.xml.transform.Source;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the number of products");
        int numberOfProducts = scanner.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.println("Prdouct #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)?");
            char commonUsedImported = scanner.next().charAt(0);
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Price: ");
            Double price = scanner.nextDouble();


            if (commonUsedImported == 'i') {
                System.out.println("Custom Fee: ");
                Double customFee = scanner.nextDouble();
                Product product = new ImportedProduct(name, price , customFee);
                list.add(product);
            } else if (commonUsedImported == 'u') {
                System.out.println("Manufacture date: ");
                LocalDate date = LocalDate.parse(scanner.next(), dateTimeFormatter);
                Product product = new UsedProduct(name, price , date);
                list.add(product);
            } else {
                Product product = new Product(name, price);
                list.add(product);
            }

        }

        System.out.println("PRICE TAGS: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).priceTag());
        }


    }
}
