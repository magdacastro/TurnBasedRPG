package Habilidades;

public class Habilidade {
    private String nomeHabilidade;
    private double dano;
    private TipoDano tipoDano;
    private TipoHabilidade tipoHabilidade;

    public Habilidade(String nomeHabilidade, double dano, TipoDano tipoDano, TipoHabilidade tipoHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
        this.dano = dano;
        this.tipoDano = tipoDano;
        this.tipoHabilidade = tipoHabilidade;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public TipoHabilidade getTipoHabilidade() {
        return tipoHabilidade;
    }

    public TipoDano getTipoDano() {
        return tipoDano;
    }
}
