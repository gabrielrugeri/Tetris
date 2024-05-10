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
        this.setColor(Colours.ANSI_YELLOW);
        int[][] form= {{2,2},{2,2}};
        this.setForm(form);
        this.setWidth(this.getForm().length);
        this.setHeight(this.getForm()[0].length);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(1, 9));
    }
}
