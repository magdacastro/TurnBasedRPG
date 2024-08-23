package TiposPersonagem;

import Habilidades.Habilidade;
import Personagem.Personagem;
import TipoArma.TipoArma;

import java.util.List;

public class Guerreiro extends Personagem {
    private TipoArma arma;
    private int danoMedioArma;

    public Guerreiro(String nome, int pontosVida, int forca, int defesa, Habilidade habilidade, int agilidade, int resistenciaFisica, int resistenciaMagica, TipoArma arma) {
        super(nome, pontosVida, forca, defesa, habilidade, agilidade, resistenciaFisica, resistenciaMagica);
        this.arma = arma;
    }

    public TipoArma getArma() {
        switch (arma) {
            case MACHADO:
                this.setForca(this.getForca() + 8);
                break;
            case ESPADA:
                this.setAgilidade(this.getAgilidade() + 10);
                break;
            case LANCA:
                this.setResistenciaFisica(this.getResistenciaFisica() + 12);
        }

        return arma;
    }

}
