Resumo
	O presente projeto possui o objetivo de implementar um jogo funcional de Tetris, utilizando os conceitos de orientação a objeto e a linguagem de programação Java. Tetris trata-se de um jogo eletrônico clássico de quebra-cabeça — lançado em 1985 — inspirado no jogo pentaminó cujo objetivo é organizar figuras geométricas dentro de uma caixa. O criador de Tetris, Alexey Pajitnov, rapidamente identificou o potencial do jogo, uma vez que ele e seus colegas de trabalho se viram viciados na jogatina. O jogo Tetris consiste em empilhar peças, nomeadas tetriminos, de modo a formar linhas completas, as quais desintegram liberando espaço no tabuleiro. É permitido rotacionar as peças e movê-las lateralmente no tabuleiro de modo a encontrar a melhor posição para encaixe. O jogo se encerra quando a pilha de peças alcança o topo do tabuleiro.

Sobre as funcionalidades do jogo
	Por se tratar de um jogo, o componente visual é imprescindível para que seja demonstrado o funcionamento dele, mesmo que de uma versão inicial. Mesmo com a orientação de que interfaces gráficas seriam implementadas na parte 2 do projeto, o grupo julgou que para apresentar uma evolução satisfatória nesse primeiro momento a parte gráfica seria necessária. Contudo, na parte 1 não será implementada a interação com o usuário — portanto não será possível jogar Tetris —, de forma que isso ficará para a Parte 2, bem como melhorias na interface gráfica e em alguns recursos do jogo.
	Dessa forma, nesse primeiro momento, levantou-se as principais funções que nosso sistema deve conter, já separando por escopo ao qual deve pertencer. 

Funções relacionadas à Peça:
Movimentar a peça lateralmente no tabuleiro;
Gerar a peça randomicamente na porção superior do tabuleiro;
Rotacionar a peça;
Funções relacionadas ao tabuleiro:
Mostrar a peça no tabuleiro;
Limpar a peça do tabuleiro; 
Deletar uma linha preenchida por peças;
Atualizar o tabuleiro o qual contém as peças que já caíram;
Funções relacionadas à Engine:
Checar as colisões de uma peça com as demais que estão no tabuleiro;
Implementar a queda rápida de uma peça;
Capturar os comandos do jogador;
Implementar o sistema de pontuação;
Implementar a função que roda o jogo, a qual deve gerar randomicamente o formato da peça e fazê-la cair, ao passo que verifica as colisões e o completar de uma linha; 
