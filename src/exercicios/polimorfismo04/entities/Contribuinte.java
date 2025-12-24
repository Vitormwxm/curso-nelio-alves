package exercicios.polimorfismo04.entities;

import exercicios.polimorfismo04.enums.TipoContribuinte;

public abstract class Contribuinte {
    private String nome;
    private Double rendaAnual;
    private TipoContribuinte tipoContribuinte;

    public Contribuinte(String nome, Double rendaAnual, TipoContribuinte tipoContribuinte) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.tipoContribuinte = tipoContribuinte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public TipoContribuinte getTipoContribuinte() {
        return tipoContribuinte;
    }

    public void setTipoContribuinte(TipoContribuinte tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
    }

    public abstract Double CalculaImposto();
}
