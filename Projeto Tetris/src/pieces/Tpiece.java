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
 *  Esta classe é referente à peça T. Contém seu construtor e métodos para a implementação.
 */
public class Tpiece extends Piece{
    // Construtor
    public Tpiece() {
        super();
        this.setColor(Colours.ANSI_PINK);
        int[][] form= {{4, 4, 4}, {0, 4, 0}};
        this.setForm(form);
        this.setWidth(this.getForm().length);
        this.setHeight(this.getForm()[0].length);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(2, 8));
    }
}
