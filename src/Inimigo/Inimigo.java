package Inimigo;

import Habilidades.Habilidade;
import Habilidades.TipoHabilidade;
import Personagem.Personagem;
import Inimigo.TipoInimigo;

import java.util.List;

public class Inimigo extends Personagem {
    private int recompensaXP;
    private TipoInimigo tipoInimigo;

    public Inimigo(String nome, int pontosVida, int forca, int defesa, Habilidade habilidade, int agilidade, int resistenciaFisica, int resistenciaMagica, TipoInimigo tipoInimigo) {
        super(nome, pontosVida, forca, defesa, habilidade, agilidade, resistenciaFisica, resistenciaMagica);
        this.tipoInimigo = tipoInimigo;
    }

    public int getRecompensaXP() {
        switch (this.tipoInimigo) {
            case OGRO:
                this.recompensaXP = 300;
                break;
            case GOBLIN:
                this.recompensaXP = 450;
                break;
            case TROLL:
                this.recompensaXP = 600;
                break;
            case MONSTRO:
                this.recompensaXP = 750;
                break;
            case DRAGAO:
                this.recompensaXP = 900;
                break;
        }

        return recompensaXP;
    }

    public void setRecompensaXP(int recompensaXP) {
        this.recompensaXP = recompensaXP;
    }

    public TipoInimigo getTipoInimigo() {
        switch (this.tipoInimigo) {
            case OGRO:
                this.setResistenciaFisica(this.getResistenciaFisica() + 6);
                this.setForca(this.getForca() + 6);
                this.setDefesa(this.getDefesa() + 6);
                this.setAgilidade(this.getAgilidade() + 3);
                this.setResistenciaMagica(this.getResistenciaMagica() + 3);
                if(this.getHabilidade().getTipoHabilidade().equals(TipoHabilidade.TERRA)){
                    this.setForca(this.getForca() + 8);
                    this.setResistenciaFisica(this.getResistenciaFisica() + 8);
                }
                break;
            case GOBLIN:
                this.setResistenciaFisica(this.getResistenciaFisica() + 8);
                this.setForca(this.getForca() + 8);
                this.setDefesa(this.getDefesa() + 8);
                this.setAgilidade(this.getAgilidade() + 4);
                this.setResistenciaMagica(this.getResistenciaMagica() + 4);
                if(this.getHabilidade().getTipoHabilidade().equals(TipoHabilidade.TERRA)){
                    this.setForca(this.getForca() + 10);
                    this.setResistenciaFisica(this.getResistenciaFisica() + 10);
                }
                break;
            case TROLL:
                this.setResistenciaFisica(this.getResistenciaFisica() + 10);
                this.setForca(this.getForca() + 10);
                this.setDefesa(this.getDefesa() + 10);
                this.setAgilidade(this.getAgilidade() + 6);
                this.setResistenciaMagica(this.getResistenciaMagica() + 6);
                if(this.getHabilidade().getTipoHabilidade().equals(TipoHabilidade.TERRA)){
                    this.setForca(this.getForca() + 12);
                    this.setResistenciaFisica(this.getResistenciaFisica() + 12);
                }
                break;
            case MONSTRO:
                this.setResistenciaFisica(this.getResistenciaFisica() + 12);
                this.setForca(this.getForca() + 12);
                this.setDefesa(this.getDefesa() + 12);
                this.setAgilidade(this.getAgilidade() + 8);
                this.setResistenciaMagica(this.getResistenciaMagica() + 8);
                if(this.getHabilidade().getTipoHabilidade().equals(TipoHabilidade.TERRA)){
                    this.setForca(this.getForca() + 14);
                    this.setResistenciaFisica(this.getResistenciaFisica() + 14);
                } else if (this.getHabilidade().getTipoHabilidade().equals(TipoHabilidade.AGUA)) {
                    this.setDefesa(this.getDefesa() + 14);
                    this.setAgilidade(this.getAgilidade() + 10);
                }
                break;
            case DRAGAO:
                this.setResistenciaFisica(this.getResistenciaFisica() + 14);
                this.setForca(this.getForca() + 14);
                this.setDefesa(this.getDefesa() + 14);
                this.setAgilidade(this.getAgilidade() + 10);
                this.setResistenciaMagica(this.getResistenciaMagica() + 10);
                if(this.getHabilidade().getTipoHabilidade().equals(TipoHabilidade.FOGO)){
                    this.setResistenciaFisica(this.getResistenciaFisica() + 16);
                } else if (this.getHabilidade().getTipoHabilidade().equals(TipoHabilidade.AGUA)) {
                    this.setDefesa(this.getDefesa() + 16);
                    this.setAgilidade(this.getAgilidade() + 12);
                } else if (this.getHabilidade().getTipoHabilidade().equals(TipoHabilidade.VENTO)) {
                    this.setForca(this.getForca() + 18);
                    this.setAgilidade(this.getAgilidade() + 16);
                }
                break;
        }

        return tipoInimigo;
    }


}
