package Arena;

import Inimigo.Inimigo;
import Personagem.Personagem;

public class Batalha {

    public Batalha() {}

    public void lutar(Personagem p1, Personagem p2){
        Personagem personagemAtacante;
        Personagem personagemDefensor;

        if (p1.getAgilidade() > p2.getAgilidade()) {
            personagemAtacante = p1;
            personagemDefensor = p2;
        } else {
            personagemAtacante = p2;
            personagemDefensor = p1;
        }

        while(personagemAtacante.getPontosVida() > 0 && personagemDefensor.getPontosVida() > 0){
            System.out.println("Vida do atacante: " + personagemAtacante.getNome() + " - " + personagemAtacante.getPontosVida());
            System.out.println("Vida do defensor: " + personagemDefensor.getNome() + " - " + personagemDefensor.getPontosVida());

            System.out.println("********************************************");

            System.out.println("O ataque da vez é: " + personagemAtacante.getNome() + " com o dano de " + personagemAtacante.getHabilidade().getDano());
            personagemAtacante.atacar(personagemDefensor);

            System.out.println("A vida do oponente está em: " + personagemDefensor.getPontosVida() + ".");

            Personagem personagemTemporario = personagemAtacante;
            personagemAtacante = personagemDefensor;
            personagemDefensor = personagemTemporario;

            if(personagemAtacante.getPontosVida() <= 0){
                System.out.println("O personagem vencedor é " + personagemDefensor.getNome() + ".");
            } else if (personagemDefensor.getPontosVida() <= 0) {
                System.out.println("O personagem vencedor é " + personagemAtacante.getNome() + ".");
            }

        }

        if(p1.getPontosVida() <= 0) {
            if(p1 instanceof Inimigo) {
                p2.setNivel(((Inimigo) p1).getRecompensaXP());

            }
        } else if (p2.getPontosVida() <= 0) {
            if (p2 instanceof Inimigo) {
                p1.setNivel(((Inimigo) p2).getRecompensaXP());
            }
        }
    }
}
