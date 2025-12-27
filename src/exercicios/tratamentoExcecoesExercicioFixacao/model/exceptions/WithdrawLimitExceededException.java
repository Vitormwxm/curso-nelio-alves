package exercicios.tratamentoExcecoesExercicioFixacao.model.exceptions;

public class WithdrawLimitExceededException extends Exception {
    public WithdrawLimitExceededException(String message) {
        super(message);
    }
}
