package exercicios.interfaces.aula2.application;

import exercicios.interfaces.aula2.model.entities.Contract;
import exercicios.interfaces.aula2.model.entities.Installment;
import exercicios.interfaces.aula2.model.services.ContractService;
import exercicios.interfaces.aula2.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato");
        System.out.print("Numero:");
        int number = scanner.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), dateTimeFormatter);
        System.out.println("Valor do contrato: ");
        double totalValue = scanner.nextDouble();

        Contract contract = new Contract(number, date, totalValue);
        System.out.println("Entre com o numero de parcelas: ");
        int n = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }


        scanner.close();
    }
}
