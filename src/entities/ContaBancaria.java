package entities;

import java.util.Scanner;

public class ContaBancaria {
    private String numeroConta;
    private String titularConta;
    private double valorDeposito;

    public ContaBancaria(String numeroConta, String titularConta, double valorDeposito) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.valorDeposito = valorDeposito;
    }

    public ContaBancaria() {
    }

    public String imprimeDados () {
        return toString();
    }

    public ContaBancaria(String numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    }

    public void aumentaDeposito() {
//        double aumento
        System.out.println("entre com o valor do depósito");
        Scanner scanner = new Scanner(System.in);
        double valorDeposito = scanner.nextDouble();
//        contaBancaria.aumentaDeposito(valorDeposito);
//        System.out.println(contaBancaria.imprimeDados());
       setValorDeposito(getValorDeposito() + valorDeposito);
    }

    public void saque(double saque) {
        setValorDeposito(getValorDeposito() - saque);
    }
















    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    private void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    @Override
    public String toString() {
        return "dados da conta: \n" +
                "numeroConta " + numeroConta + '\'' +
                ", titularConta " + titularConta + '\'' +
                ", valorDeposito " + valorDeposito +
                '}';
    }
}
