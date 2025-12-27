package exercicios.tratamentoSolucaoRuim.model.exceptions;

// excecao na entidade de dominio
public class DomainException extends Exception{
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg); // permite passar uma mensagem para a exceção
    }
}
