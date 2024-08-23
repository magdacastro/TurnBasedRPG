package TiposPersonagem;

import Habilidades.Habilidade;
import Personagem.Personagem;

import java.util.List;

public class Mago extends Personagem {
    private int pontosDeMagia;

    public Mago(String nome, int pontosVida, int forca, int defesa, Habilidade habilidade, int agilidade, int resistenciaFisica, int resistenciaMagica, int pontosDeMagia) {
        super(nome, pontosVida, forca, defesa, habilidade, agilidade, resistenciaFisica, resistenciaMagica);
        this.pontosDeMagia = pontosDeMagia;
        this.getHabilidade().setDano(this.getHabilidade().getDano() + this.pontosDeMagia);
    }

    public int getPontosDeMagia() {
        return pontosDeMagia;
    }

    public void setPontosDeMagia(int pontosDeMagia) {
        this.pontosDeMagia = pontosDeMagia;
    }
}
