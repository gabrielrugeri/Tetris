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
public class Zpiece extends Piece{
    // Construtor
    public Zpiece() {
        super();
        this.setColor(Colours.ANSI_RED);
        int[][] form= {{5, 0}, {5, 5}, {0, 5}};
        this.setForm(form);
        this.setWidth(this.getForm().length);
        this.setHeight(this.getForm()[0].length);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(2, 8));
    }
}
