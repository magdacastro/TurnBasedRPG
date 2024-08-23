package TiposPersonagem;

import Habilidades.Habilidade;
import Personagem.Personagem;

import java.util.List;

public class Bardo extends Personagem {
    private int persuassao;

    public Bardo(String nome, int pontosVida, int forca, int defesa, Habilidade habilidade, int agilidade, int resistenciaFisica, int resistenciaMagica, int persuassao) {
        super(nome, pontosVida, forca, defesa, habilidade, agilidade, resistenciaFisica, resistenciaMagica);
        this.persuassao = persuassao;
        this.getHabilidade().setDano(this.getHabilidade().getDano() + this.persuassao);
    }

    public int getPersuassao() {
        return persuassao;
    }

    public void setPersuassao(int persuassao) {
        this.persuassao = persuassao;
    }

}
