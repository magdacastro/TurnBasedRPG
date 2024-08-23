package TiposPersonagem;

import Habilidades.Habilidade;
import Habilidades.TipoDano;
import Personagem.Personagem;

public class Arqueiro extends Personagem {
    private int destreza;

    public Arqueiro(String nome, int pontosVida, int forca, int defesa, Habilidade habilidade, int agilidade, int resistenciaFisica, int resistenciaMagica, int destreza) {
        super(nome, pontosVida, forca, defesa, habilidade, agilidade, resistenciaFisica, resistenciaMagica);
        this.destreza = destreza;
        this.getHabilidade().setDano(this.getHabilidade().getDano() + this.destreza);
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

}

