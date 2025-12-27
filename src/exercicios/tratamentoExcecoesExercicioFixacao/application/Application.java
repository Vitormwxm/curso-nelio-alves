package exercicios.tratamentoExcecoesExercicioFixacao.application;

import exercicios.tratamentoExcecoesExercicioFixacao.model.entities.Account;
import exercicios.tratamentoExcecoesExercicioFixacao.model.exceptions.InsufficientFundsException;
import exercicios.tratamentoExcecoesExercicioFixacao.model.exceptions.WithdrawLimitExceededException;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta: ");
            System.out.print("Numero: ");
            int number = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Titular: ");
            String titular = scanner.nextLine();

            System.out.print("Saldo inicial: ");
            Double InitialBalance = scanner.nextDouble();

            System.out.print("Limite de saque: ");
            Double withdrawLimit = scanner.nextDouble();

            Account account = new Account(number, titular, InitialBalance, withdrawLimit);

            System.out.println("Entre com a quantidade que deseja sacar");
            Double quantityWithdraw = scanner.nextDouble();
            account.withdraw(quantityWithdraw);
            System.out.println(account);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (WithdrawLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
