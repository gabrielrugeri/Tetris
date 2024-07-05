***Resumo***

	
>O presente projeto possui o objetivo de implementar um jogo funcional de Tetris, utilizando os conceitos de orientação a objeto e a linguagem de programação Java. Tetris trata-se de um jogo eletrônico clássico de
 quebra-cabeça — lançado em 1985 — inspirado no jogo pentaminó cujo objetivo é organizar figuras geométricas dentro de uma caixa. O criador de Tetris, Alexey Pajitnov, rapidamente identificou o potencial do jogo, uma vez
 que ele e seus colegas de trabalho se viram viciados na jogatina. O jogo Tetris consiste em empilhar peças, nomeadas tetriminos, de modo a formar linhas completas, as quais desintegram liberando espaço no tabuleiro. É 
 permitido rotacionar as peças e movê-las lateralmente no tabuleiro de modo a encontrar a melhor posição para encaixe. O jogo se encerra quando a pilha de peças alcança o topo do tabuleiro.

***Sobre as funcionalidades do jogo***

>Com a implementação da interface gráfica, podemos transformar o jogo em algo funcional. Nesse sentido, houveram atualização no código referente a algumas funcionalidades. Por fim, levantou-se todas as funções responsáveis por fazer o jogo funcionar.

***Funções relacionadas à Peça***

>Movimentar a peça lateralmente no tabuleiro;

>Gerar a peça randomicamente na porção superior do tabuleiro;

>Rotacionar a peça;


***Funções relacionadas ao tabuleiro***

>Mostrar a peça no tabuleiro;

>Limpar a peça do tabuleiro; 

>Deletar uma linha preenchida por peças;

>Atualizar o tabuleiro o qual contém as peças que já caíram;


***Funções relacionadas à Engine***

>Checar as colisões de uma peça com as demais que estão no tabuleiro nas diferentes direções;

>Checar a possibilidade de  rotação da peça;

>Verificar a completude de uma fileira;

>Implementar a rotação e movimentação das peças;

>Implementar a queda rápida de uma peça;

>Capturar os comandos do jogador;

>Implementar o sistema de pontuação;

>Implementar a função que roda o jogo, a qual deve gerar randomicamente o formato da peça e fazê-la cair, ao passo que verifica as colisões e o completar de uma linha; 

***Funções relacionadas à Windwow***

>Construir a janela do jogo, a partir da criação do painel, da aba de pontuação, do botão de saída. Por fim, inicializa a janela. Define também as teclas responsáveis pela movimentação dos blocos no tabuleiro;

>Atualizar as partes do tabuleiro do jogo;

>Salvar em arquivo texto a evolução do jogo;

***Funções relacionadas ao Bloco***

>Construção visual do bloco, a partir do enum de cores;

>Acessar o bloco;

>Atualizar a cor do bloco para a desejada;

***Funções relacionadas ao Botão de Saída***

>Construção do botão de saída com a imagem e tamanho desejado;

>Estabelecer sua funcionalidade, fechar a janela do jogo;

***Funções relacionadas à Pontuação**

>Construção do painel de pontuação, estabelecendo a fonte do texto, tamanho, fundo e borda;

>Atualiza a pontuação a ser mostrada a partir da transformação da variável inteiro no tabuleiro em string;

***Funções relacionadas ao Painel de Fundo**

>Estabelece a imagem de fundo do painel do jogo;

>Posiciona a imagem de fundo;
