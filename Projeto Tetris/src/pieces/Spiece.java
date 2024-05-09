/*
 * Piece.java
 *
 * última modificação: 09/05/2024
 *
 * Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
 */
package pieces;

import java.util.concurrent.ThreadLocalRandom;

/**
 *  Esta classe é referente à peça S. Contém seu construtor e métodos para a implementação.
 */
public class Spiece extends Piece{
    // Construtor
    public Spiece() {
        super();
        this.setColor(7);
        int[][] form= {{7,7,0},{0,7,0},{0,7,7}};
        this.setForm(form);
        this.setRotation(0);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(2, 8));
        this.setY(0);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for(int i=0; i<this.getForm().length;i++) {
            for (int j = 0; j < this.getForm()[i].length; j++)
                out.append(((this.getForm()[i][j] > 0) ? STR."\{Colors.ANSI_GREEN}  \{Colors.ANSI_RESET}" : STR."\{Colors.ANSI_WHITE}  \{Colors.ANSI_RESET}"));
            out.append("\n");
        }
        return out.toString();
    }
}
