package exercicios.interfaces.exercicio.model.services;

public class BrazilTaxService {

    public Double amount(Double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
