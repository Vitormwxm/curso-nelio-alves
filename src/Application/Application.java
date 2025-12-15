package Application;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(scanner.next(), dateTimeFormatter);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter Order Data");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(scanner.next());

        System.out.println("How many items to this order?");
        int quantityItemsOrder = scanner.nextInt();

        LocalDate dateNow = LocalDate.now();

        Order order = new Order(dateNow, status, client);

        OrderItem orderItem;
        for (int i = 1; i <= quantityItemsOrder; i++) {

            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product Name: ");
            String productName = scanner.next();
            System.out.print("Product Price: ");
            Double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = scanner.nextInt();

            Product product = new Product(productName, productPrice);

            orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY");
        System.out.println(order);

    }
}
