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
 *  Esta classe é referente à peça J. Contém seu construtor e métodos para a implementação.
 */
public class Jpiece extends Piece{
    //Construtor
    public Jpiece() {
        super();
        this.setColor(Colours.ANSI_BLUE);
        int[][] form= {{0,6},{0,6},{6,6}};
        this.setForm(form);
        this.setWidth(this.getForm().length);
        this.setHeight(this.getForm()[0].length);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(2, 7));
    }
}
