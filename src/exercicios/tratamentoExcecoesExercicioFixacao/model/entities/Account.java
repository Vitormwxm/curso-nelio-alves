package exercicios.tratamentoExcecoesExercicioFixacao.model.entities;


import exercicios.tratamentoExcecoesExercicioFixacao.model.exceptions.InsufficientFundsException;
import exercicios.tratamentoExcecoesExercicioFixacao.model.exceptions.WithdrawLimitExceededException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void amount(Double amount) {
         this.balance += amount;
    }

    public void withdraw(Double amount) throws WithdrawLimitExceededException, InsufficientFundsException{
        if (amount > withdrawLimit) {
            throw new WithdrawLimitExceededException("Limite de saque excedido");
        }

        if (balance < 0.0 || balance < amount) {
            throw new InsufficientFundsException("Saldo insuficiente");
        }

        this.balance -= amount;

    }

    @Override
    public String toString() {
        return "New balance: " + balance;
    }
}
