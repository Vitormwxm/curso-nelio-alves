package Application;

import entities.ContaBancaria;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o numero da conta");
        String numeroConta = scanner.nextLine();
        System.out.println("Entre com o titular da conta: ");
        String titularConta = scanner.nextLine();

        String depositoInicial;

        do {
            System.out.println("Deseja fazer um depósito inicial? y/n");
            depositoInicial = scanner.nextLine();

            if (!depositoInicial.equals("y") && !depositoInicial.equals("n")) {
                System.out.println("digite 's' para sim e 'n' para não");
            }


        } while (!depositoInicial.equals("y") && !depositoInicial.equals("n"));

        ContaBancaria contaBancaria;

        if (depositoInicial.equals("y")) {
            System.out.println("Entre com o valor do depósito");
            double valorDeposito = scanner.nextDouble();
            contaBancaria = new ContaBancaria("8095", titularConta, valorDeposito);

            System.out.println(contaBancaria.imprimeDados());

        } else {
            contaBancaria = new ContaBancaria(numeroConta , titularConta);
            System.out.println(contaBancaria.imprimeDados());
        }

//        System.out.println("entre com o valor do depósito");
//        double valorDeposito = scanner.nextDouble();
//        contaBancaria.aumentaDeposito(valorDeposito);
//        System.out.println(contaBancaria.imprimeDados());
        contaBancaria.aumentaDeposito();
        System.out.println(contaBancaria.imprimeDados());

        System.out.println("entre com o valor do saque");
        double valorDoSaque = scanner.nextDouble();
        contaBancaria.saque(valorDoSaque);
        System.out.println(contaBancaria.imprimeDados());



    }
}
