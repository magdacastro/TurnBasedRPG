import Arena.Batalha;
import Habilidades.Habilidade;
import Habilidades.TipoDano;
import Habilidades.TipoHabilidade;
import Inimigo.Inimigo;
import TiposPersonagem.Arqueiro;

import static Habilidades.TipoDano.MAGICO;
import static Habilidades.TipoHabilidade.AGUA;
import static Habilidades.TipoHabilidade.FOGO;
import static Inimigo.TipoInimigo.DRAGAO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter. List.of()
public class Main {
    public static void main(String[] args) {
        int pontosHP = 10000;

        Arqueiro arqueiro = new Arqueiro("John", pontosHP, 350, 180, new Habilidade("Rajada de Flechas", 300, MAGICO, AGUA), 425, 250, 150, 400);
        Inimigo dragao = new Inimigo("Drogon", pontosHP, 300, 135, new Habilidade("Bola de Fogo", 280, MAGICO, FOGO), 400, 175, 75, DRAGAO);

        Batalha batalha = new Batalha();
        batalha.lutar(arqueiro, dragao);
    }
}
