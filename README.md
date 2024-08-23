# Combate em um Jogo de RPG de Turno

Este projeto implementa o sistema de combate para um jogo de RPG baseado em turnos, onde personagens e inimigos se enfrentam em batalhas estratégicas.

## Descrição Geral

O sistema de combate em RPG de turno é estruturado em torno de dois conceitos principais: **turnos** e **rodadas**. Cada personagem e inimigo tem a chance de realizar uma ação em seu turno, e uma rodada é composta por todos os turnos dos personagens e inimigos.

### O que é um Turno?

Um **turno** é uma oportunidade de ação para um personagem ou inimigo durante o combate. Durante seu turno, um personagem pode escolher entre várias ações, como:

- **Atacar:** Realizar um ataque contra um inimigo.
- **Usar uma Habilidade:** Utilizar uma habilidade especial ou mágica.
- **Defender:** Reduzir o dano recebido até o próximo turno.
- **Fugir:** Tentar escapar do combate.

Cada personagem e inimigo participa de uma batalha por turno, o que garante que todos tenham a chance de agir.

### O que é uma Rodada?

Uma **rodada** é o ciclo completo de turnos de todos os personagens e inimigos envolvidos na batalha. Após todos terem realizado suas ações, a rodada é concluída e uma nova rodada começa, continuando o combate até que um dos lados seja derrotado.

## Como Funciona o Combate?

### 1. Início da Batalha:

- **Listagem dos Participantes:** Quando a batalha começa, todos os personagens e inimigos envolvidos são listados.
- **Determinação da Ordem dos Turnos:** A ordem dos turnos pode ser determinada por atributos como velocidade ou destreza, ou seguir uma ordem pré-definida (por exemplo, personagem -> inimigo -> personagem -> inimigo).

### 2. Execução de Turnos:

- **Escolha de Ação:** Em seu turno, cada personagem escolhe uma ação, como atacar, usar uma habilidade, defender ou fugir.
- **Aplicação dos Efeitos:** A ação escolhida é executada, e seus efeitos (dano, cura, etc.) são aplicados ao alvo correspondente.
- **Fim do Turno:** Após a execução da ação, o turno do personagem termina, e o próximo participante realiza sua ação.

### 3. Fim da Rodada:

- **Verificação do Status:** Quando todos os participantes completam seus turnos, a rodada termina.
- **Início de Nova Rodada:** Se houver personagens ou inimigos ainda ativos, uma nova rodada começa.

### 4. Fim do Combate:

- **Condições de Vitória ou Derrota:** O combate continua até que todos os inimigos ou todos os personagens sejam derrotados.
- **Recompensas:** Após a batalha, os personagens podem receber pontos de experiência, itens, e outros prêmios.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação usada para implementar o sistema de combate.
- **POO (Programação Orientada a Objetos):** Paradigma utilizado para estruturar as classes e interações entre personagens e inimigos.

## Como Usar

1. **Instanciação dos Personagens e Inimigos:** Crie os objetos que representam os personagens e inimigos envolvidos na batalha.
2. **Início do Combate:** Inicie o combate, determinando a ordem dos turnos.
3. **Execução de Turnos:** Cada personagem ou inimigo realiza suas ações até que a batalha termine.

## Autor

Este projeto foi desenvolvido por Magda Castro.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
