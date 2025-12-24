package exercicios.polimorfismo04.entities;

import exercicios.polimorfismo04.enums.TipoContribuinte;

public class PessoaFisica extends Contribuinte{
    private Double gastoComSaude;

    public PessoaFisica(String nome, Double rendaAnual, TipoContribuinte tipoContribuinte, Double gastoComSaude) {
        super(nome, rendaAnual, tipoContribuinte);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public Double CalculaImposto() {
        if (getRendaAnual() <= 20000) {
            return getRendaAnual() * 0.15;
        } else {
            return (getRendaAnual() * 0.25) - (getGastoComSaude() * 0.50);
        }
    }
}
