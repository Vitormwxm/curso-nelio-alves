package exercicios.polimorfismo04.entities;

import exercicios.polimorfismo04.enums.TipoContribuinte;

public class PessoaJuridica extends Contribuinte{
    private int numeroFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, TipoContribuinte tipoContribuinte, int numeroFuncionarios) {
        super(nome, rendaAnual, tipoContribuinte);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double CalculaImposto() {
        Double imposto = 0.16;

        if (numeroFuncionarios > 10) {
            imposto = 0.14;
            return getRendaAnual() * imposto;
        }

        return  getRendaAnual() * imposto;
    }
}
