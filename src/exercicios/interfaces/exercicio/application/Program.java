package exercicios.interfaces.exercicio.application;

import exercicios.interfaces.exercicio.model.entities.CarRental;
import exercicios.interfaces.exercicio.model.entities.Vehicle;
import exercicios.interfaces.exercicio.model.services.BrazilTaxService;
import exercicios.interfaces.exercicio.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = scanner.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.println("Entrada (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora: ");
        Double pricePerHour = scanner.nextDouble();

        System.out.println("Entre com o preço por hora: ");
        Double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay , new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("FATURA");
        System.out.println("PAGAMENTO BASICO: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento Total: " + carRental.getInvoice().totalPayment());

    }
}
