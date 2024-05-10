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
 *  Esta classe é referente à peça O. Contém seu construtor e métodos para a implementação.
 */
public class Opiece extends Piece{
    // Construtor
    public Opiece() {
        super();
        this.setColor(4);
        int[][] form= {{2,2},{2,2}};
        this.setForm(form);
        this.setRotation(0);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(1, 9));
        this.setY(0);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for(int i=0; i<this.getForm().length;i++) {
            for (int j = 0; j < this.getForm()[i].length; j++)
                out.append(((this.getForm()[i][j] > 0) ? STR."\{Colors.ANSI_YELLOW}  \{Colors.ANSI_RESET}" : STR."\{Colors.ANSI_WHITE}  \{Colors.ANSI_RESET}"));
            out.append("\n");
        }
        return out.toString();
    }
}
