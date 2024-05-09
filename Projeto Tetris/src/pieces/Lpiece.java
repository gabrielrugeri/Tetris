/*
 * Lpiece.java
 *
 * última modificação: 09/05/2024
 *
 * Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
 */
package pieces;

import java.util.concurrent.ThreadLocalRandom;

/**
 *  Esta classe é referente à peça L. Contém seu construtor e métodos para a implementação.
 */
public class Lpiece extends Piece {
    // Construtor
    public Lpiece() {
        super();
        this.setColor(3);
        int[][] form= {{3,0},{3,0},{3,3}};
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
        for(int i=0; i<this.getForm().length;i++)
            for(int j=0; j<this.getForm()[i].length;j++)
                out.append(((this.getForm()[i][j]>0) ? STR."\{Colors.ANSI_ORANGE} \{Colors.ANSI_RESET}" : STR."\{Colors.ANSI_WHITE}  \{Colors.ANSI_RESET}").repeat(this.getForm()[i][j]));
        return out.toString();
    }
}
