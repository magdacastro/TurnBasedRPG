package Personagem;


import Habilidades.Habilidade;
import Habilidades.TipoDano;
import Habilidades.TipoHabilidade;

import java.util.List;

public class Personagem {
    protected String nome;
    protected int pontosVida;
    protected int forca;
    protected int defesa;
    protected Habilidade habilidade;
    protected int agilidade;
    protected int resistenciaFisica;
    protected int resistenciaMagica;
    protected int nivel;

    public Personagem(String nome, int pontosVida, int forca, int defesa, Habilidade habilidade, int agilidade, int resistenciaFisica, int resistenciaMagica) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.forca = forca;
        this.defesa = defesa;
        this.habilidade = habilidade;
        this.agilidade = agilidade;
        this.resistenciaFisica = resistenciaFisica;
        this.resistenciaMagica = resistenciaMagica;
    }

    public int calcularDano(Personagem outroPersonagem) {
        int danoInicial;
        int danoCalculado;

        if(this.habilidade.getTipoDano().equals(TipoDano.MAGICO)) {
            danoInicial = (int) this.habilidade.getDano() * (1 - (outroPersonagem.getResistenciaMagica() / 1000));
        } else if(this.habilidade.getTipoDano().equals(TipoDano.FISICO)){
            danoInicial = (int) this.habilidade.getDano() * (1 - (outroPersonagem.getResistenciaFisica() / 1000));
        } else {
            danoInicial = (int) this.habilidade.getDano();
        }

        switch (this.habilidade.getTipoHabilidade()){
            case FOGO:
                if(outroPersonagem.getHabilidade().equals(TipoHabilidade.VENTO)){
                    danoCalculado = (int)(danoInicial * 1.06);
                    return danoCalculado;
                }
            case VENTO:
                if(outroPersonagem.getHabilidade().equals(TipoHabilidade.RAIO)){
                    danoCalculado = (int)(danoInicial * 1.06);
                    return danoCalculado;
                }
            case RAIO:
                if(outroPersonagem.getHabilidade().equals(TipoHabilidade.TERRA)){
                    danoCalculado = (int)(danoInicial * 1.06);
                    return danoCalculado;
                }
            case TERRA:
                if(outroPersonagem.getHabilidade().equals(TipoHabilidade.AGUA)){
                    danoCalculado = (int)(danoInicial * 1.06);
                    return danoCalculado;
                }
            case AGUA:
                if(outroPersonagem.getHabilidade().equals(TipoHabilidade.FOGO)){
                    danoCalculado = (int)(danoInicial * 1.06);
                    return danoCalculado;
                }
        }

        return danoInicial;
    }

    public void atacar(Personagem outroPersonagem) {
        int reducao = this.calcularDano(outroPersonagem);

        outroPersonagem.setPontosVida(outroPersonagem.getPontosVida() - (reducao * this.defender()));
    }

    public int defender(){
        int defesa = this.getDefesa() + this.getResistenciaFisica() + this.getResistenciaMagica();

        return (1000 - defesa) / 100;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }

    public int getResistenciaMagica() {
        return resistenciaMagica;
    }

    public void setResistenciaMagica(int resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }

    public int getResistenciaFisica() {
        return resistenciaFisica;
    }

    public void setResistenciaFisica(int resistenciaFisica) {
        this.resistenciaFisica = resistenciaFisica;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

