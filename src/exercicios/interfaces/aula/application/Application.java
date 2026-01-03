package exercicios.interfaces.aula.application;

import exercicios.interfaces.aula.model.entities.CarRental;
import exercicios.interfaces.aula.model.entities.Vehicle;
import exercicios.interfaces.aula.model.services.BrazilTaxService;
import exercicios.interfaces.aula.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = scanner.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora: ");
        double pricePerHour = scanner.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().totalPayment());

        scanner.close();
    }
}
